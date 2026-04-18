package Assignments;

@FunctionalInterface
interface MyInterface {
    void display();
}

public class Q8 {
    public static void main(String[] args) {

        // Anonymous class
        MyInterface obj1 = new MyInterface() {
            public void display() {
                System.out.println("Anonymous class");
            }
        };

        // Lambda expression
        MyInterface obj2 = () -> System.out.println("Lambda expression");

        obj1.display();
        obj2.display();
    }
}