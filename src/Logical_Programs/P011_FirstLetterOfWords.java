package Logical_Programs;

import java.util.Scanner;

public class P011_FirstLetterOfWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String:");
        String str = scan.nextLine();
        String[] str_arr = str.split(" ");
        int count = 0;
        for (int i = 0; i < str_arr.length; i++) {
            System.out.println("1st letter of each word:" + str_arr[i].charAt(0));
        }
    }
}
