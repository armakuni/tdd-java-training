/*
 * All years divisible by 400 ARE leap years
 * All years divisible by 100 but NOT by 400 ARE NOT leap years
 * All years divisible by 4 but Not by 100 ARE leap years
 * All years not divisible by 4 ARE NOT leap years
 */
public class LeapYear {

    private boolean isDivisibleBy(int year, int divisor) {
        return year % divisor == 0;
    }

    public boolean isLeapYear(int year) {
        if (isDivisibleBy(year, 400)) return true;
        if (isDivisibleBy(year, 100)) return false;
        return isDivisibleBy(year, 4);
    }
}
