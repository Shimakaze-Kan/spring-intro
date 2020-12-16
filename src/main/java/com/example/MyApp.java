package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(MessageServiceConfig.class);
        MessageService messageService = ctx.getBean(MyNameMessageService.class);
        MessageService messageService2 = ctx.getBean(RandomTextMessageService.class);

        System.out.println("Hash 1: "+messageService.hashCode()+"\nHash 2: "+messageService2.hashCode());
        System.out.println(messageService.getMessage());
        System.out.println(messageService2.getMessage());
    }
}
