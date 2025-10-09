package Logical_Programs;

import java.util.Scanner;

public class P015_Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String:");
        String str = scan.nextLine();
        String reversed_str = "";

        for (int i = str.length()-1; i >=0 ; i--){
            reversed_str += str.charAt(i);
        }
//        System.out.println(reversed_str);
        if(reversed_str.equals(str))
            System.out.printf("String %s is Palindrome", str );
        else
            System.out.printf("String %s is not Palindrome", str);

    }
}
