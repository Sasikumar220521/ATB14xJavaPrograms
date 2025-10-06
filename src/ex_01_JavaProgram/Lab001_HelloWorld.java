package ex_01_JavaProgram;

public class Lab001_HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(3/2.5); // println -> interger part -> no decimal //doubt

        float temp = 98.4f; if(temp > 98.4) { System.out.println("SUMMER"); } else { System.out.println("UNKNOWN"); }

        long num = 123L;
        if(num > 123)
            System.out.println("TIGER");
        else
            System.out.println("BIRD");

//        int a = 0;
//        if(a++) System.out.print("Hello"); else System.out.print("World");

//        int cnt=0;
//        while(true)
//        {
//            if(cnt > 4)
//                break;
//            if(cnt==0)
//            {
//                cnt++;
//                continue;
//            }
//            System.out.print(cnt + ",");
//            cnt++;
//        }
//
//        int i=1, j=1; while(i<3) {
//            do {
//                System.out.print(j + ","); j++; }while(j<4);
//            i++; }

//        int i=1, j=1; while(i<3) { do { System.out.print(j + ","); j++; }while(j<4); i++; }

//        char ch[] = {'A', 'B', 'C'}; int i1=0; do { System.out.print(ch[i1] + ","); i++; }while(i1 < ch.length);


//        char ch[] = {'A', 'B', 'C'}; int i=0; do { System.out.print(ch[i] + ","); i++; }while(i < ch.length);

//        String str[] = {"A","B","C"}; int i=0;
//        do { if(i>= str.length)
//            break;
//            System.out.print(str[i] + ","); i++; }while(true);

//        int score=1; for(; true; score++) { System.out.print(score +","); if(score > 3) break; }
    }


}
