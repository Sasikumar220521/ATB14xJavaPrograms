package Logical_Programs;

import java.util.Scanner;

public class P028_LeapYear {

    public static void main(String[] args) {
        int year = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");

        if (scanner.hasNextInt())
            year = scanner.nextInt();
        else
            System.out.println("Enter year(number) only");

        System.out.printf("%d is %s", year , leapOrNot(year));
    }

    static String leapOrNot(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return "a Leap year";
        else
            return "not a Leap year";
    }
}
