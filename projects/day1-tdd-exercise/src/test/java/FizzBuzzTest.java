import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.String.valueOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    @DisplayName("If the number is divisible by 3, return 'fizz'.")
    void evaluateFizzBuzz_whenNumberDivisibleBy3IsPassed_shouldReturnFizz(int inputNumber) {
        String expectedResponse = "fizz";

        String actualResponse = new FizzBuzz().evaluateFizzBuzz(inputNumber);

        assertEquals(expectedResponse, actualResponse);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    @DisplayName("If the number is divisible by 5, return 'buzz'.")
    void evaluateFizzBuzz_whenNumberDivisibleBy5IsPassed_shouldReturnBuzz(int inputNumber) {
        String expectedResponse = "buzz";

        String actualResponse = new FizzBuzz().evaluateFizzBuzz(inputNumber);

        assertEquals(expectedResponse, actualResponse);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    @DisplayName("If the number is divisible by 3 and 5, return 'fizzbuzz'.")
    void evaluateFizzBuzz_whenNumberDivisibleBy3Andy5IsPassed_shouldReturnFizzBuzz(int inputNumber) {
        String expectedResponse = "fizzbuzz";

        String actualResponse = new FizzBuzz().evaluateFizzBuzz(inputNumber);

        assertEquals(expectedResponse, actualResponse);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 7, -23})
    @DisplayName("If the number is not divisible by 3 or 5, return the number as a string.")
    void evaluateFizzBuzz_whenNumberIsNotDivisibleBy3Or5IsPassed_shouldReturnFizzBuzz(int inputNumber) {
        String expectedResponse = valueOf(inputNumber);

        String actualResponse = new FizzBuzz().evaluateFizzBuzz(inputNumber);

        assertEquals(expectedResponse, actualResponse);
    }
}