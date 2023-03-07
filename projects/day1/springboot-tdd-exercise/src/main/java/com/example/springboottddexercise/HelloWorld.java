package com.example.springboottddexercise;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

@RestController
public class HelloWorld {

    @GetMapping(value = "/helloworld/{name}")
    public String getMessage(@PathVariable String name) {
        if (!name.matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$")) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                    "Name should only be alphabetic");
        }
        return "Hello World " + name;
    }
}
