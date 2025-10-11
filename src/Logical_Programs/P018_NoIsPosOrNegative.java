package Logical_Programs;

import java.util.Scanner;

public class P018_NoIsPosOrNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");

        if (scan.hasNextInt() ){
            int num = scan.nextInt();
            if(num>0)
                System.out.printf("Number %d is positive", num);
            else if (num<0)
                System.out.printf("Number %d is positive", num);
        }else{
            System.out.println("Enter number only");
            System.exit(0);
        }

    }
}
