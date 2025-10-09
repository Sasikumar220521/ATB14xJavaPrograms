package Logical_Programs;

public class P013_SecondMaxNo_WO_Sort {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        int second_highest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > second_highest && numbers[i] < max) {
                second_highest = numbers[i];
            }
        }
//        System.out.println("Max:" + max);
        System.out.println("Second highest:" + second_highest);
    }
}
