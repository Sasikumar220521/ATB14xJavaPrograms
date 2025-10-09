package Logical_Programs;

import java.util.Scanner;

public class P017_Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the value to calculate factorial of n terms:");
        Scanner scan = new Scanner(System.in);
        int nTerm = scan.nextInt();
        int fact = 1;
        for (int i = 1; i <= nTerm; i++) {
            fact = fact * i;
            System.out.print(i + " ");
        }
        System.out.println("Factorial of n numbers: " + fact);

    }
}