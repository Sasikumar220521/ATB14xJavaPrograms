package Logical_Programs;

import java.util.Scanner;

public class P026_SmallestOfThree {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        P026_SmallestOfThree smt = new P026_SmallestOfThree();
        smt.smallestOfThree(num1, num2, num3);
    }

    void smallestOfThree(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3){
            System.out.println("Numbers are equal");
        }else if ((num1 < num2) && (num1 < num3)) {
            System.out.printf("%d is smaller", num1);
        } else if (num2 < num3){
            System.out.printf("%d is smaller", num2);
        }else{
            System.out.printf("%d is smaller", num3);
        }

    }
}
