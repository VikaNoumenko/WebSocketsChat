package ru.itis.dao;

import org.springframework.stereotype.Repository;
import ru.itis.model.Chat;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ChatDaoNamedJdbcImpl implements ChatDao {

    //language=SQL
    private static final String SQL_FIND = "SELECT * FROM chat WHERE id = :id";

    //language=SQL
    private static final String SQL_FIND_ALL = "SELECT chat.id AS chat_id, chat.name AS chat_name, message.id AS message_id," +
            " message.text AS message_text, message.chat_id AS message_chat_id\n" +
            "FROM chat\n" +
            "  JOIN service_user\n" +
            "    ON service_user.id = creator_id\n" +
            "  JOIN message\n" +
            "    ON message.chat_id = chat.id\n" +
            "  JOIN chat_user\n" +
            "    ON service_user.id = chat_user.user_id ORDER BY chat.id;";


    //language=SQL
    private static final String SQL_SAVE = "INSERT INTO chat(name, creator_id) VALUES (:name, :creator)";
    //language=SQL
    private static final String SQL_DELETE = "DELETE FROM chat WHERE id = :id";
    //language=SQL
    private static final String SQL_UPDATE = "UPDATE chat SET name = :name,:creator_id = :creator WHERE id = :id";

    private UsersDao usersDao;
    private MessageDao messageDao;

    @PersistenceContext
    private EntityManager entityManager;

    public Chat find(int id) {

        Chat chat = (Chat) entityManager.createQuery(SQL_FIND_ALL, Chat.class)
                .setParameter("id", id);
        return chat;
    }

    public int save(Chat chat) {
        entityManager.persist(chat);
        entityManager.flush();
        return chat.getId();
    }

    public void delete(int id) {
        Chat chat = find(id);
        entityManager.remove(chat);
    }

    public List<Chat> findAll() {
        return (List<Chat>) entityManager.createQuery(SQL_FIND_ALL, Chat.class);
    }

    public void update(Chat chat) {
        entityManager.merge(chat);
    }

}