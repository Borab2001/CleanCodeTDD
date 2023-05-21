package year;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearDetectorTest {

    @Test
    public void testLeapYearDivisibleByFour() {
        LeapYearDetector detector = new LeapYearDetector();
        assertTrue(detector.isLeapYear(2004));
    }

    @Test
    public void testNonLeapYearDivisibleByOneHundred() {
        LeapYearDetector detector = new LeapYearDetector();
        assertFalse(detector.isLeapYear(1900));
    }

    @Test
    public void testLeapYearDivisibleByFourHundred() {
        LeapYearDetector detector = new LeapYearDetector();
        assertTrue(detector.isLeapYear(2000));
    }
}
