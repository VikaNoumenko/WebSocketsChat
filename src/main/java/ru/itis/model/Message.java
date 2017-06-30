package ru.itis.model;

import javax.persistence.*;

/**
 * 06.05.2017
 * Message
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Entity
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chat_id")
    private Chat chat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private User author;

    @Column(name = "text")
    private String text;

   public Message(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
        public String toString() {
            return id + " "
                    + text + " "
                    + chat + " "
                    + author;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj != null && obj instanceof Message){
                Message that = (Message)obj;
                return this.id == that.id
                        && this.text.equals(that.text)
                        && this.chat.equals(that.chat)
                        && this.author.equals(that.author);
            } return false;
        }
    }

