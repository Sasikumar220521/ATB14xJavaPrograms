package ex_02_JavaPrograms;

public class Lab003_MMain {
    public static void main(String[] args) {
//        System.out.println(10+3/2-1*5);
    String st = "I am sk";
    String rev_st = "";
    for(int i = st.length()-1; i>=0; i--){
        rev_st = rev_st + st.charAt(i);
        }
    System.out.println("Original string: "+ st);
    System.out.println("Final reversed string: "+ rev_st);
    }
}
