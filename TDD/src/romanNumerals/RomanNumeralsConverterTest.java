package romanNumerals;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsConverterTest {
    private RomanNumeralsConverter converter;

    @Before
    public void setUp() {
        converter = new RomanNumeralsConverter();
    }

    @Test
    public void testOne() {
        assertEquals("I", converter.convertToRoman(1));
    }

    @Test
    public void testFour() {
        assertEquals("IV", converter.convertToRoman(4));
    }

    @Test
    public void testFive() {
        assertEquals("V", converter.convertToRoman(5));
    }

    @Test
    public void testNine() {
        assertEquals("IX", converter.convertToRoman(9));
    }

    @Test
    public void testTen() {
        assertEquals("X", converter.convertToRoman(10));
    }

    @Test
    public void testForty() {
        assertEquals("XL", converter.convertToRoman(40));
    }

    @Test
    public void testFifty() {
        assertEquals("L", converter.convertToRoman(50));
    }

    @Test
    public void testNinety() {
        assertEquals("XC", converter.convertToRoman(90));
    }

    @Test
    public void testOneHundred() {
        assertEquals("C", converter.convertToRoman(100));
    }

    @Test
    public void testFourHundred() {
        assertEquals("CD", converter.convertToRoman(400));
    }

    @Test
    public void testFiveHundred() {
        assertEquals("D", converter.convertToRoman(500));
    }

    @Test
    public void testNineHundred() {
        assertEquals("CM", converter.convertToRoman(900));
    }

    @Test
    public void testOneThousand() {
        assertEquals("M", converter.convertToRoman(1000));
    }

    @Test
    public void testMixedNumbers() {
        assertEquals("MMXXIII", converter.convertToRoman(2023));
        assertEquals("MCMXCIX", converter.convertToRoman(1999));
        assertEquals("MMMCMXCIV", converter.convertToRoman(3994));
    }
}
