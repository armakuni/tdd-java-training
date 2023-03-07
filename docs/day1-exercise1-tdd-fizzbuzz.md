# Day 1 Exercise 1: TDD Fizzbuzz

This exercise involves building a [Fizzbuzz](https://en.wikipedia.org/wiki/Fizz_buzz) method using Test-Driven
Development to evolve your design iteratively.

TDD gives you continuous feedback on the quality of your design whilst building confidence in your code.

## Approach

When doing this exercise, try to implement the method using tests to convince yourself that the code you have written is
correct.

Implement 1 test at a time, and then write the code needed to pass the test, as per the red-green-refactor cycle.

## Functional requirements

You need to build a fizzbuzz method meeting the following requirements:

+ If the number is divisible by 3, return 'fizz'.
+ If the number is divisible by 5, return 'buzz'.
+ If the number is divisible by 3 and 5, return 'fizzbuzz'.
+ If the number is not divisible by 3 or 5, return the number as a string.

## How to Work

1. From CLI terminal Change the dir to `/tdd-java-training/projects/day1/java-tdd-exercise` and execute below command to
   run tests for `FizzBuzzTest.java`
    ```
    ./gradlew test --tests="FizzBuzzTest"
    ```
   Alternatively you can open
   the [FizzBuzzTest.java](../projects/day1/java-tdd-exercise/src/test/java/FizzBuzzTest.java) file and execute test
   from IDE.
2. Create separate files for your main code and test code (e.g. `src/main/java/FizzBuzz.java`
   and `src/test/java/FizzBuzzTest.java`.)
3. Follow the red-green-refactor cycle when developing your code.
