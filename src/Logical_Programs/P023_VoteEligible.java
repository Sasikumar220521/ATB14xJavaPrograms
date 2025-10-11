package Logical_Programs;

import java.util.Scanner;

public class P023_VoteEligible {
    public static void main(String[] args) {
        System.out.println("Enter Person age");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int age = scanner.nextInt();
            if(age>=18)
                System.out.println("Person is eligible for vote");
            else
                System.out.println("Person is not eligible for vote");
        }else
            System.out.println("Enter number only for age");
    }
}
