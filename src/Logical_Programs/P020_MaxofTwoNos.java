package Logical_Programs;

import java.util.Scanner;

public class P020_MaxofTwoNos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        if(scan.hasNextInt()){
            int num1 = scan.nextInt();
            System.out.println("Enter 2nd number: ");
            if(scan.hasNextInt()) {
                int num2 = scan.nextInt();
                if(num1>num2)
                    System.out.printf("Number %d is maximum", num1);
                else if(num1<num2)
                    System.out.printf("Number %d is maximum", num2);
                else
                    System.out.println("Both Numbers are equal");
            }
            else
                System.out.println("Enter number only");
        }else
            System.out.println("Enter number only");


    }

}
