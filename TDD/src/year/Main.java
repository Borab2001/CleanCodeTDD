package year;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LeapYearDetector detector = new LeapYearDetector();

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (detector.isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
