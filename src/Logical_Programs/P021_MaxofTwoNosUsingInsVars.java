package Logical_Programs;

import java.util.Scanner;

public class P021_MaxofTwoNosUsingInsVars {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;  // instance variables
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        if (scan.hasNextInt()) {
            num1 = scan.nextInt();
            System.out.println("Enter 2nd number: ");
            if (scan.hasNextInt()) {
                num2 = scan.nextInt();
            } else {
                System.out.println("Enter number only");
                System.exit(0);
            }
        } else {
            System.out.println("Enter number only");
            System.exit(0);
        }

        if (num1 > num2)
            System.out.printf("Number %d is maximum", num1);
        else if (num1 < num2)
            System.out.printf("Number %d is maximum", num2);
        else
            System.out.println("Both Numbers are equal");
    }

}
