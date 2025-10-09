package Logical_Programs;

import java.util.Scanner;

public class P008_RevStringWithoutInbuilt {
    //Program to reverse a string without using inbuilt functions
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String to be reversed:");
        String str = scan.nextLine();

        String reversed_str = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed_str += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed_str);
    }
}
