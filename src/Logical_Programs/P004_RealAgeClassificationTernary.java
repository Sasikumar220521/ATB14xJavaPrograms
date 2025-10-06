package Logical_Programs;

public class P004_RealAgeClassificationTernary {
    public static void main(String[] args) {
        int age = 59;
        String classified_age = age<18 ? ("Minor") : (age<=59 ? "Adult" : "Sr Senior");
        System.out.println("RealAgeClassificationTernary: " + classified_age);
    }
}
