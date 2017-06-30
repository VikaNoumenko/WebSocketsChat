package ru.itis.service;

import ru.itis.model.Message;

import java.util.List;

public interface MessageService {

    Message find(int id);
    int save(Message model);
    void update(Message model);
    void delete(int id);
    List<Message> findAll();
    List<Message> findAllByChatId(int id);
}
