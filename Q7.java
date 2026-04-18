package Assignments;

//Single
class A { void show() { System.out.println("A"); } }
class B extends A { }

//Multilevel
class C extends B { }

//Hierarchical
class D extends A { }

public class Q7 {
 public static void main(String[] args) {
     C obj = new C();
     obj.show();

     D obj2 = new D();
     obj2.show();
 }
}
