# Day 1 Exercise 1: TDD LeapYear

This exercise involves building a [Leap Year](https://en.wikipedia.org/wiki/Leap_year) method using Test-Driven Development to evolve your design iteratively. 

TDD gives you continuous feedback on the quality of your design whilst building confidence in your code.

## Approach

When doing this exercise, try to implement the method using tests to convince yourself that the code you have written is correct.

Implement 1 test at a time, and then write the code needed to pass the test, as per the red-green-refactor cycle.

## Functional requirements

You need to build a LeapYear method meeting the following requirements:

- All years divisible by 400 ARE leap years
- All years divisible by 100 but NOT by 400 ARE NOT leap years
- All years divisible by 4 but Not by 100 ARE leap years
- All years not divisible by 4 ARE NOT leap years

## How to Work

1. From CLI terminal Change the dir to `/tdd-java-training/projects/day1-tdd-exercise` and execute below command to run tests for `LeapYearTest.java`
    ```
    ./gradlew test --tests="LeapYearTest"
    ```
   Alternatively you can open the [LeapYearTest.java](../projects/day1-tdd-exercise/src/test/java/LeapYearTest.java) file and execute test from IDE.
2. Create separate files for your main code and test code (e.g. `src/main/java/LeapYear.java` and `src/test/java/LeapYearTest.java`.)
3. Follow the red-green-refactor cycle when developing your code.
