package Logical_Programs;

import java.util.Scanner;

public class P030_CharIsAlphabet {
    public static void main(String[] args) {
        charIsAlphabet();
    }

    static void charIsAlphabet() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter alphabet: ");
            String entered_str = scanner.next();

            if (entered_str.length() > 1)
                System.out.printf("%s is not a character \n", entered_str);
            else {
                char c = entered_str.charAt(0);
                if (("" + c).matches("[a-zA-Z]")) {
                    System.out.printf("%c is alphabet", c);
                    break;
                }
//                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
//                    System.out.printf("%c is alphabet", c);
//                    break;
//                }
                else
                    System.out.printf("%c is not alphabet \n", c);
            }

        }
    }

}
