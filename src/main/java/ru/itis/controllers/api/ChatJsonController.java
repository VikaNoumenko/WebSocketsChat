package ru.itis.controllers.api;/* 30.05.2017
ChatJsonController @author Victoria Noumenko 
@version v1.0 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itis.model.Chat;
import ru.itis.service.ChatService;

public class ChatJsonController {
    @Autowired
    ChatService chatService;

    @RequestMapping(value = "/annotation/chat/json", method =  RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Chat find(){
        Chat chats = chatService.find(3);
        return chats;
    }
}
