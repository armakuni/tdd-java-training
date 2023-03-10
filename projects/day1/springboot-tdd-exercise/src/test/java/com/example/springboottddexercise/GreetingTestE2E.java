package com.example.springboottddexercise;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingTestE2E {

    @Value(value = "${local.server.port}")
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greeting_shouldReturnGreetingMessage() {
        GreetingRequest request = new GreetingRequest();
        request.setName("abhishek");
        request.setTime(11);

        String actualResponse = this.restTemplate.postForObject("http://localhost:" + port + "/greeting", request, String.class);

        assertThat(actualResponse).isEqualTo("Good Morning abhishek");
    }
}