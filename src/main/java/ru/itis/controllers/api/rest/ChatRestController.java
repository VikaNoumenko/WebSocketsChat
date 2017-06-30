package ru.itis.controllers.api.rest;/* 30.05.2017
ChatRestController @author Victoria Noumenko 
@version v1.0 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.itis.model.Chat;
import ru.itis.service.ChatService;


public class ChatRestController {
    @Autowired
    private ChatService chatService;

//    @GetMapping(value = "/chats/{id}")
//    public Chat getId(@PathVariable("id") int chatId) {
//        return chatService.find(3);
//    }

//    @RequestMapping(value = "/chats", method = RequestMethod.POST)
//    public ResponseEntity<Chat> addChat(
//            @RequestBody Chat chat
//    )
}
