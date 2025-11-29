package Logical_Programs;

//public class Test1 {
//    public static void main(String[] args) {
//
//    }
//}

/*
//--------
class Parent { void show()
{ System.out.println("Parent"); } }

class Child extends Parent { void show() {
    System.out.println("Child"); } }

public class Main {
    public static void main(String[] args)
    { Parent p = new Child(); p.show(); } }
//--------
*/

/*interface A { void show(); }
class B implements A
{ public void show()
{ System.out.println("Show"); } }
public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.show(); }
}*/

class Outer
{ int x = 10;
    class Inner
        { void show() { System.out.println(x); } }
}
public class Test1 {
    public static void main(String[] args)
    { Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.show(); }
//     try { int a = 10/0; }
//     catch (Exception e)
//    { System.out.println("Catch"); }
//     finally { System.out.println("Finally"); }
}