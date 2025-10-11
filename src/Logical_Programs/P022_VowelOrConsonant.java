package Logical_Programs;

import java.util.Scanner;

public class P022_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String ent_ch = scanner.next();
        String vowel = "aeiou";
        String alpha_regex = "[A-Za-z]";
//        if(ent_ch.length() == 1 && Character.isLetter(ent_ch.charAt(0))){
        if(ent_ch.length() == 1 && ent_ch.matches(alpha_regex)){
            if(vowel.contains(ent_ch.toLowerCase()))
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }else
            System.out.println("Enter a character only");
    }
}
