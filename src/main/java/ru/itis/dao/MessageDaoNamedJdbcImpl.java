package ru.itis.dao;

import org.springframework.stereotype.Repository;
import ru.itis.model.Message;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MessageDaoNamedJdbcImpl implements MessageDao {
    //language=SQL
    private static final String SQL_SAVE = "INSERT INTO message(text, chat_id, author_id) VALUES (:text, :chat, :author)";
    //language=SQL
    private static final String SQL_UPDATE = "UPDATE message SET text = :text WHERE id = :id";
    //language=SQL
    private static final String SQL_FIND = "SELECT * FROM message WHERE id = :id";
    //language=SQL
    private static final String SQL_FIND_ALL = "SELECT * FROM message";
    //language=SQL
    private static final String SQL_DELETE = "DELETE FROM message WHERE id = :id";
    //language=SQL
    private static final String SQL_FIND_ALL_BY_CHAT_ID = "SELECT * FROM message JOIN chat ON message.chat_id = chat.id WHERE chat.id = :id";

    private UsersDao usersDao;
    private ChatDao chatDao;

    @PersistenceContext
    private EntityManager entityManager;

    public Message find(int id) {
        Message message = (Message) entityManager.createQuery(SQL_FIND_ALL , Message.class)
                .setParameter("id", id);
        return message;
    }

    public int save(Message message) {
        entityManager.persist(message);
        entityManager.flush();
        return message.getId();
    }

    public void delete(int id) {
        Message message = find(id);
        entityManager.remove(message);
    }

    public List<Message> findAll() {

        return (List<Message>) entityManager.createQuery(SQL_FIND_ALL, Message.class);
    }

    public void update(Message message) {
        entityManager.merge(message);
    }

    @Override
    public List<Message> findAllByChatId(int id) {
         return (List<Message>) entityManager.createQuery(SQL_FIND_ALL_BY_CHAT_ID ,Message.class)
                 .setParameter("id",id);
    }
}

