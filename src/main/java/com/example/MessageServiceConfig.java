package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MessageServiceConfig
{
    @Bean
    public MyNameMessageService myNameMessageService()
    {
        return new MyNameMessageService();
    }

    @Bean
    public RandomTextMessageService randomTextMessageService()
    {
        return new RandomTextMessageService();
    }
}
