package com.example;

import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {

    private String message = "Wiktor Sokół";
    public String getMessage()
    {
        return message;
    }
}
