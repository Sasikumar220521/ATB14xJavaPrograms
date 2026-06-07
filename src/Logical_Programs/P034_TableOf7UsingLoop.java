package Logical_Programs;

public class P034_TableOf7UsingLoop {
    public static void main(String[] args) {
        int table = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%dx%d=%d", i, table, table * i).println();
//            System.out.println();
        }
    }
}