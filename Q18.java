package Assignments;

import java.util.*;

class Animal {}
class Dog extends Animal {}

public class Q18 {

    // Upper bound (? extends)
    static void printAnimals(List<? extends Animal> list) {
        for (Animal a : list) {
            System.out.println(a);
        }
    }

    // Lower bound (? super)
    static void addDogs(List<? super Dog> list) {
        list.add(new Dog());
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();

        printAnimals(dogs); // extends
        addDogs(animals);   // super

        // Unbounded (?)
        List<?> anyList = dogs;
        System.out.println(anyList);
    }
}