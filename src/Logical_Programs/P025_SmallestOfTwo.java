package Logical_Programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P025_SmallestOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter num1: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int num1 = scan.nextInt();
            System.out.println("Enter num2: ");
            if (scan.hasNextInt()){
                int num2 = scan.nextInt();
                if (num1 < num2)
                    System.out.printf("Smallest number is %d", num1);
                else if(num2 < num1)
                    System.out.printf("Smallest number is %d", num2);
                else
                    System.out.println("Both numbers are equal");
            }else
                System.out.println("Enter number only");
        } else
            System.out.println("Enter number only");
    }
}
