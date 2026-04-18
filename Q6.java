package Assignments;

abstract class Shape { // Abstraction
    abstract void area();
}

class Rectangle extends Shape { // Inheritance
    int l = 5, b = 3;

    void area() { // Polymorphism
        System.out.println("Area: " + (l * b));
    }
}

public class Q6 {
    public static void main(String[] args) {
        Shape s = new Rectangle(); // Runtime polymorphism
        s.area();
    }
}