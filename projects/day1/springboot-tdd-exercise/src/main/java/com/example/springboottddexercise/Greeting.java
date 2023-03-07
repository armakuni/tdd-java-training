package com.example.springboottddexercise;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
    @PostMapping(value = "/greeting")
    public String greet(@RequestBody GreetingRequest greetingRequest) {
        int time = greetingRequest.getTime();
        String greetingType = null;
        if (time >= 4 && time < 12) {
            greetingType = "Morning ";
        } else if (time >= 12 && time < 17) {
            greetingType = "Afternoon ";
        } else if (time >= 17 && time < 20) {
            greetingType = "Evening ";
        } else {
            greetingType = "Night ";
        }
        return "Good " + greetingType + greetingRequest.getName();
    }
}
