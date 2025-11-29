package Logical_Programs;

public class P032_PersonTwoIns {
    String name;
    int age;
    public P032_PersonTwoIns(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        P032_PersonTwoIns john = new P032_PersonTwoIns("John", 25);
        P032_PersonTwoIns alice = new P032_PersonTwoIns("Alice", 30);
        System.out.println("Name: " + john.name + ", Age: " + john.age + ", Name: " + alice.name + ", Age: " +alice.age);
    }
}
