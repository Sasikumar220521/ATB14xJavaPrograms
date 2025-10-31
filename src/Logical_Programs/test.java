package Logical_Programs;

public class test {
    static boolean boo;
    static int a;

    static void boo() {
        int x = 5;
        System.out.println(++x);
        System.out.println(a);
        if (boo) {
            System.out.println("true");
        } else
            System.out.println("false");
    }

    public static void main(String[] args) {
        System.out.println(10 + 20 + "Hello");
        boo();

        String s1 = new String("ab");
        String s2 = new String("ab");
        String s3 = "ab";
        if(s1.equals(s2)){
            System.out.println("content equal");
        }
        if(s1==s2)
            System.out.println("location same");
        else
            System.out.println("Location not same");
//        int 123name = 10;
//        int _name = 10;
//        int *name = 10;
//        int name-value = 10;

        for (int i = 0; i < 5;) {
            System.out.println(i);

        }

    }
}
