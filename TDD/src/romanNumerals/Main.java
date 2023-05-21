package romanNumerals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer to convert it to Roman numeral:");
        int number = scanner.nextInt();

        String romanNumeral = converter.convertToRoman(number);
        System.out.println("The Roman numeral representation of " + number + " is: " + romanNumeral);
    }
}
