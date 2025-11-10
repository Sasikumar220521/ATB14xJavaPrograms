package Logical_Programs;

public class P024_Pattern {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* " );
            }
            System.out.println();
        }


//        --working
//        for (int i = 0; i < n; i++) {
////            System.out.print(i+"--");
//            for (int j = n - 1; j >= i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        --alternate
       /* for (int i = 0; i < n; i++) {
//            System.out.print(i+"--");
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/

/*        for (int i = 0; i < n; i++) {
//            System.out.print(i+"--");
            for (int j = n-1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}
