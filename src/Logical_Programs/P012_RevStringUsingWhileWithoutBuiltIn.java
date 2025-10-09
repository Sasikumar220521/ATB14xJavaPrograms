package Logical_Programs;

import java.util.Scanner;

public class P012_RevStringUsingWhileWithoutBuiltIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String to be reversed:");
        String str = scan.nextLine();

        String reversed_str = "";
        int i = str.length()-1;
        while(i>=0){
            reversed_str += str.charAt(i);
            i--;
        }
//        for (int i = str.length()-1; i >=0 ; i--) {
//            reversed_str += str.charAt(i);
//        }
        System.out.println("Reversed string using while without inbuilt function: " + reversed_str);
    }
}
