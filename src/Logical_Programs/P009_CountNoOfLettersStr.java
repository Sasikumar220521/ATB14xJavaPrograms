package Logical_Programs;

import java.util.Scanner;

public class P009_CountNoOfLettersStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String:");
        String str = scan.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            count += 1;
        }
        System.out.println("Count no of letters:"+count);
    }
}

