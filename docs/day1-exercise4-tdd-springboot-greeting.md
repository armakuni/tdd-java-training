# Day 1 Exercise 4: TDD Greeting Spring Boot Application

This exercise involves building a Greeting Application using Spring Boot practising Test-Driven
Development to evolve your design iteratively.

TDD gives you continuous feedback on the quality of your design whilst building confidence in your code.

## Approach

When doing this exercise, try to implement the method using tests to convince yourself that the code you have written is
correct.

Implement 1 test at a time, and then write the code needed to pass the test, as per the red-green-refactor cycle.

## Functional requirements

You need to build a `POST` API meeting the following requirements:

- Given a user wants to be greeted with below request body
 
- When User makes a call to a `POST` API at `http://localhost:8080/greeting`
- Then the API should return a response `Good Morning Abhishek`
  
Given the user wants to be greeted
- When the user invokes the `POST` API at `http://localhost:8080/greeting` with below request body
   ```json
   { "name": "Abhishek", "time" : 11 }
  ```
- And Morning time is greater than, equal to "4" and less than "12" then the user should be greeted as "Good Morning Abhishek"
- And Afternoon time is greater than, equal to "12" and less than to "17" then the user should be greeted as "Good Afternoon Abhishek"
- And Evening time is greater than, equal to "17" and less than "20" then the user should be greeted as "Good Evening Abhishek"
- And Night time is greater than, equal to "20" and is less than 4" then the user should be greeted as "Good Night Abhishek"

## How to Work

1. From CLI terminal Change the dir to `/tdd-java-training/projects/day1/sprinboot-tdd-exercise` and execute below command to
   run tests for `GreetingTestE2E.java`
    ```
    ./gradlew test --tests="GreetingTestE2E"
    ```
   Alternatively you can open
   the [GreetingTestE2E.java](../projects/day1/springboot-tdd-exercise/src/test/java/com/example/springboottddexercise/GreetingTestE2E.java) file and execute test
   from IDE.
2. Create separate files for your main code and test code
   - Main Code - `projects/day1/springboot-tdd-exercise/src/main/java/com/example/springboottddexercise/Greeting.java`
   - E2E Test  - `projects/day1/springboot-tdd-exercise/test/main/java/com/example/springboottddexercise/GreetingTestE2E.java`
   - Unit Test - `projects/day1/springboot-tdd-exercise/test/main/java/com/example/springboottddexercise/GreetingTest.java`
3. Follow the red-green-refactor cycle when developing your code.
4. Write your first test in `GreetingTest.java`.
5. Execute test from CLI terminal by changing the dir to `/tdd-java-training/projects/day1/springboot-tdd-exercise` and execute below command to
   run tests for `GreetingTest.java`
   ```
   ./gradlew test --tests="GreetingTest"
   ```
   Alternatively you can open
   the [GreetingTest.java](../projects/day1/springboot-tdd-exercise/src/test/java/com/example/springboottddexercise/GreetingTest.java) file and execute test
   from IDE.
