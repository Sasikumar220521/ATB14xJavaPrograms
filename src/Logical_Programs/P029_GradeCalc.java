package Logical_Programs;

import java.util.Scanner;

//90 - 100   A+
//80 - 89    A
//70 - 79    B
//60 - 69    C
//50 - 59    D
//40 - 49    E
//Below 40   Fail
public class P029_GradeCalc {
    public static void main(String[] args) {
        gradeCalc();
    }

    static void gradeCalc() {
        Scanner scanner;
        while (true) {
            System.out.print("Enter mark: ");
            scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int mark = scanner.nextInt();
                if (mark >= 0 && mark <= 100) {
                    if (mark >= 90)
                        System.out.println("Grade A+");
                    else if (mark >= 80)
                        System.out.println("Grade A");
                    else if (mark >= 70)
                        System.out.println("Grade B");
                    else if (mark >= 60)
                        System.out.println("Grade C");
                    else if (mark >= 50)
                        System.out.println("Grade D");
                    else if (mark >= 40)
                        System.out.println("Grade E");
                    else if (mark < 40)
                        System.out.println("Fail");
                    break;
                } else
                    System.out.println("Enter valid mark 0 to 100");
            } else
                System.out.println("Invalid data, enter number only");
        }
        scanner.close();

    }
}
