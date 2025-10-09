package Logical_Programs;

import java.util.Scanner;

public class P010_CountNoOfWordsStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String:");
        String str = scan.nextLine();
        String[] str_arr = str.split(" ");
        int count = 0;
        for (int i = 0; i < str_arr.length; i++) {
//            System.out.println(str_arr[i]);
            count += 1;
        }
        System.out.println("Count no of words:"+count);

//  Alternate logic tried with trim and counting spaces
//        String str_trimmed = str.trim();
//        for (int i = 0; i < str_trimmed.length(); i++) {
//            if (str.charAt(i) == ' ')
//                count += 1;
//        }
//        System.out.println(count+1);
    }
}
