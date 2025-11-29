package Logical_Programs;

public class P033_PersonTwoIns {
    String name;
    int age;
    public P033_PersonTwoIns(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        P033_PersonTwoIns john = new P033_PersonTwoIns("John", 25);
        P033_PersonTwoIns alice = new P033_PersonTwoIns("Alice", 30);
        System.out.println("Name: " + john.name + ", Age: " + john.age + ", Name: " + alice.name + ", Age: " +alice.age);
    }
}
