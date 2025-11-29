package Logical_Programs;

import java.util.Scanner;

public class P032_TriangleValOn3Sides {
    public static void main(String[] args) {
        P032_TriangleValOn3Sides tv = new P032_TriangleValOn3Sides();
        tv.triangleValidation();
    }

    void triangleValidation() {
        while (true) {
            System.out.println("Enter all 3 sides of a triangle");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int side1 = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    int side2 = scanner.nextInt();
                    if (scanner.hasNextInt()) {
                        int side3 = scanner.nextInt();
                        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
                            System.out.println("Triangle is valid");
                        }else
                            System.out.println("Triangle is Invalid");
                        break;
                    } else
                        System.out.println("Enter number only for sides");
                } else
                    System.out.println("Enter number only for sides");
            } else
                System.out.println("Enter number only for sides");
        }
    }

}
