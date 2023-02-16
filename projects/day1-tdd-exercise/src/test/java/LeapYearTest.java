import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeapYearTest {

    @ParameterizedTest
    @ValueSource(ints = {400, 2000, 2400})
    @DisplayName("All years divisible by 400 ARE leap years")
    void isLeapYear_whenYearDivisibleBy400IsPassed_shouldReturnTrue(int year) {
        boolean expectedResponse = true;

        boolean actualResponse = new LeapYear().isLeapYear(year);

        assertEquals(expectedResponse, actualResponse);
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 2100, 2200})
    @DisplayName("All years divisible by 100 but NOT by 400 ARE NOT leap years")
    void isLeapYear_whenYearDivisibleBy100ButNotBy400IsPassed_shouldReturnFalse(int year) {
        boolean expectedResponse = false;

        boolean actualResponse = new LeapYear().isLeapYear(year);

        assertEquals(expectedResponse, actualResponse);
    }

    @ParameterizedTest
    @ValueSource(ints = {2024, 2028})
    @DisplayName("All years divisible by 4 but Not by 100 ARE leap years")
    void isLeapYear_whenYearDivisibleBy4ButNotBy100IsPassed_shouldReturnTrue(int year) {
        boolean expectedResponse = true;

        boolean actualResponse = new LeapYear().isLeapYear(year);

        assertEquals(expectedResponse, actualResponse);
    }

    @ParameterizedTest
    @ValueSource(ints = {2001, 1991, 1975})
    @DisplayName("All years not divisible by 4 ARE NOT leap years")
    void isLeapYear_whenYearNotDivisibleBy4IsPassed_shouldReturnFalse(int year) {
        boolean expectedResponse = false;

        boolean actualResponse = new LeapYear().isLeapYear(year);

        assertEquals(expectedResponse, actualResponse);
    }
}