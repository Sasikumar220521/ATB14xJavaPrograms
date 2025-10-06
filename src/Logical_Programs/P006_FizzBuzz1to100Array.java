package Logical_Programs;

import java.util.ArrayList;

public class P006_FizzBuzz1to100Array {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                arrayList.add("FizzBuzz");
//                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                arrayList.add("Fizz");
//                System.out.println("Fizz");
            else if (i % 5 == 0)
                arrayList.add("Buzz");
//                System.out.println("Buzz");
            else
                arrayList.add(String.valueOf(i));
//                System.out.println("Number is: " + i);
        }
        for (int i = 0; i < arrayList.toArray().length ; i++) {
            System.out.print(arrayList.get(i)+ " ");

        }
    }
}
