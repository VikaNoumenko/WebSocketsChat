package ru.itis.dto;/* 30.05.2017
MessageDto @author Victoria Noumenko 
@version v1.0 */

import ru.itis.model.Chat;
import ru.itis.model.User;

public class MessageDto {
    private int id;
    private String text;
    private Chat chat;
    private User author;

    public MessageDto(Builder builder) {
        this.id = builder.id;
        this.text = builder.text;
        this.chat = builder.chat;
        this.author = builder.author;
    }

    public MessageDto(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public static class Builder {

        private int id;
        private String text;
        private Chat chat;
        private User author;

        public Builder() {
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Builder chat(Chat chat) {
            this.chat = chat;
            return this;
        }

        public Builder author(User author) {
            this.author = author;
            return this;
        }

        public MessageDto build() {
            return new MessageDto(this);
        }
    }
}
