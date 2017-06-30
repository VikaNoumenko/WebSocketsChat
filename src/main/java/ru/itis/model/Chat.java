package ru.itis.model;

import javax.persistence.*;
import java.util.List;

/**
 * 06.05.2017
 * Chat
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Entity
@Table(name = "chat")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "chat_name")
    private String chatName;

    @Column(name = "chat_author")
    private String chatAuthor;

    public Chat() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public String getChatAuthor() {
        return chatAuthor;
    }

    public void setChatAuthor(String chatAuthor) {
        this.chatAuthor = chatAuthor;
    }

    @Override
        public String toString() {
            return id + " "
                    + chatName+ " "
                    + chatAuthor;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj != null && obj instanceof Chat){
                Chat that = (Chat)obj;
                return this.id == that.id
                        && this.chatName.equals(that.chatName)
                        && this.chatAuthor.equals(that.chatAuthor);
            } return false;
        }
    }

