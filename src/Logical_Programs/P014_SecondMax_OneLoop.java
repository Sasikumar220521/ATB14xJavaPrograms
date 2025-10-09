package Logical_Programs;

public class P014_SecondMax_OneLoop {
    public static void main(String[] args) {
//        int[] numbers = {12, 34, 68, 89, 10, 1, 100, 99, 3, 4, 32, 67, 112};
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                secondHighest = highest;
                highest = numbers[i];
            } else if (numbers[i] > secondHighest && numbers[i] < highest) {
                secondHighest = numbers[i];
            }
        }
//        if (secondHighest == Integer.MIN_VALUE)
//            System.out.println("No second highest element (all elements are equal)");
//        else
//            System.out.println("Second highest number: " + secondHighest);

        System.out.println("Second highest number: " + secondHighest);
    }
}
