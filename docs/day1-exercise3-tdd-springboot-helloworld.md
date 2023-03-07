# Day 1 Exercise 3: TDD HelloWorld Spring Boot

This exercise involves building a Hello World Application using Spring Boot practising Test-Driven
Development to evolve your design iteratively.

TDD gives you continuous feedback on the quality of your design whilst building confidence in your code.

## Approach

When doing this exercise, try to implement the method using tests to convince yourself that the code you have written is
correct.

Implement 1 test at a time, and then write the code needed to pass the test, as per the red-green-refactor cycle.

## Functional requirements

You need to build a `GET` API meeting the following requirements:

### First requirement
- Given a Username is passed `Abhishek`
- When makes a call to a `GET` API at `http://localhost:8080/Abhishek`
- Then the API should return a response `Hello World Abhishek`

### Second requirement

- Given a non-alphabetic username is passed `111@aslf`
- When makes a call to a `GET` API at `http://localhost:8080/111@aslf`
- Then the API should return a error `400 BAD REQUEST` 

## How to Work

1. From CLI terminal Change the dir to `/tdd-java-training/projects/day1/sprinboot-tdd-exercise` and execute below command to
   run tests for `HelloWorldTestE2E.java`
    ```
    ./gradlew test --tests="HelloWorldTestE2E"
    ```
   Alternatively you can open
   the [HelloWorldTestE2E.java](../projects/day1/springboot-tdd-exercise/src/test/java/com/example/springboottddexercise/HelloWorldTestE2E.java) file and execute test
   from IDE.
2. Create separate files for your main code and test code 
 - Main Code - `projects/day1/springboot-tdd-exercise/src/main/java/com/example/springboottddexercise/HelloWorld.java`
 - E2E Test  - `projects/day1/springboot-tdd-exercise/test/main/java/com/example/springboottddexercise/HelloWorldTestE2E.java`
 - Unit Test - `projects/day1/springboot-tdd-exercise/test/main/java/com/example/springboottddexercise/HelloWorldTest.java`
3. Follow the red-green-refactor cycle when developing your code.
