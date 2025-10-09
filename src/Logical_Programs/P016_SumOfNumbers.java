package Logical_Programs;

import java.util.Scanner;

public class P016_SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the value to calculate sum of n terms:");
        Scanner scan = new Scanner(System.in);
        int nTerm = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= nTerm; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of n numbers: " + sum);
    }
}
