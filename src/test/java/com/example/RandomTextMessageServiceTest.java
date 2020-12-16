package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomTextMessageServiceTest {

    @Test
    public void getMessage() {
        String notExpectedMessage = "Wiktor Sokół";
        RandomTextMessageService randomTextMessageService = new RandomTextMessageService();

        assertNotEquals(notExpectedMessage, randomTextMessageService.getMessage());
    }
}