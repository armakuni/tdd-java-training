package com.example.springboottddexercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {
    @Test
    void getMessage_whenCalled_shouldReturnResponse() {
        String name = "abhishek";
        HelloWorld helloWorld = new HelloWorld();

        String actualMessage = helloWorld.getMessage(name);

        assertEquals(actualMessage, "Hello World abhishek");
    }

    @Test
    void getMessage_shouldReturnBadRequestException_whenNonAlphabeticNameIsPassed() {
        HelloWorld helloWorld = new HelloWorld();

        String actualErrorMessage = null;
        try {
            helloWorld.getMessage("1111@bc");
        } catch (Exception exception) {
            actualErrorMessage = exception.getMessage();
        }
        assertEquals("400 Name should only be alphabetic", actualErrorMessage);
    }
}
