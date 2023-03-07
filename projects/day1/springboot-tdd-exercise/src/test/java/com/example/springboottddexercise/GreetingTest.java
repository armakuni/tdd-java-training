package com.example.springboottddexercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {

    private Greeting greeting;
    private GreetingRequest greetingRequest;

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
        greetingRequest = new GreetingRequest();
        greetingRequest.setName("abhishek");
    }

    @Test
    @DisplayName("Should return morning message when time is greater than, equal to \"4\" and less than \"12\"")
    void greeting_shouldReturnMorningMessage() {
        greetingRequest.setTime(11);

        String greetingMessage = greeting.greet(greetingRequest);

        assertEquals("Good Morning abhishek", greetingMessage);
    }

    @Test
    @DisplayName("Should return afternoon message when time is greater than, equal to \"12\" and less than \"17\"")
    void greeting_shouldReturnAfterNoonMessage() {
        greetingRequest.setTime(12);

        String greetingMessage = greeting.greet(greetingRequest);

        assertEquals("Good Afternoon abhishek", greetingMessage);
    }

    @Test
    @DisplayName("Should return evening message when time is greater than, equal to \"17\" and less than \"20\"")
    void greeting_shouldReturnEveningMessage() {
        greetingRequest.setTime(18);

        String greetingMessage = greeting.greet(greetingRequest);

        assertEquals("Good Evening abhishek", greetingMessage);
    }

    @Test
    @DisplayName("Should return night message when time is greater than, equal to \"20\" and less than \"4\"")
    void greeting_shouldReturnNightMessage() {
        greetingRequest.setTime(21);

        String greetingMessage = greeting.greet(greetingRequest);

        assertEquals("Good Night abhishek", greetingMessage);
    }

    // Example of how all other tests should be refactored.
    @ParameterizedTest
    @ValueSource(ints = {20, 3})
    @DisplayName("Should return night message when time is greater than, equal to \"20\" and less than \"4\"")
    void greeting_shouldReturnNightMessage(int time) {
        greetingRequest.setTime(time);

        String greetingMessage = greeting.greet(greetingRequest);

        assertEquals("Good Night abhishek", greetingMessage);
    }
}
