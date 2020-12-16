package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("randomMessageService")
public class RandomTextMessageService implements MessageService {
    private String[] names = new String[] {"John Smith",
            "Gabriel Test",
            "Gabrietla Test",
            "Tomek Tomek",
            "Random Name",
            "Konrad Nazwisko",
            "Jakiś Tekst",
            "Bill Gates",
            "Steve Jobs",
            "John Travolta"};

    @Override
    public String getMessage() {
        int rnd = new Random().nextInt(names.length);
        return names[rnd];
    }
}
