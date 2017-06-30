package ru.itis.dto;/* 30.05.2017
ChatDto @author Victoria Noumenko 
@version v1.0 */

import ru.itis.model.User;

import java.util.List;

public class ChatDto {

    private int id;
    private User creator;
    private String name;
    private List<UserDto> users;
    private List<MessageDto> messages;

    public ChatDto(Builder builder) {
        this.id = builder.id;
        this.creator = builder.creator;
        this.name = builder.name;
        this.users = builder.users;
        this.messages = builder.messages;
    }

    public ChatDto(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserDto> getUsers() {
        return users;
    }

    public void setUsers(List<UserDto> users) {
        this.users = users;
    }

    public List<MessageDto> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageDto> messages) {
        this.messages = messages;
    }

    public static class Builder {

        private int id;
        private User creator;
        private String name;
        private List<UserDto> users;
        private List<MessageDto> messages;

        public Builder() {
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder creator(User creator) {
            this.creator = creator;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder users(List<UserDto> users) {
            this.users = users;
            return this;
        }

        public Builder messages(List<MessageDto> messages) {
            this.messages = messages;
            return this;
        }

        public ChatDto build() {
            return new ChatDto(this);
        }
    }
}
