package Logical_Programs;

public class P033_PersonTwoIns {
    String name;
    int age;
    public P033_PersonTwoIns(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        P033_PersonTwoIns sasiobj = new P033_PersonTwoIns("Sasi", 25);
        P033_PersonTwoIns kumarobj = new P033_PersonTwoIns("Kumar", 30);
        System.out.println("Name: " + sasiobj.name + ", Age: " + sasiobj.age + ", Name: " + kumarobj.name + ", Age: " +kumarobj.age);
    }
}
