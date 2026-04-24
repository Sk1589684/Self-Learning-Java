package Assignments;

import java.util.*;

class Employee2 {
    int id;
    String name;

    Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee2)) return false;

        Employee2 e = (Employee2) obj;
        return this.id == e.id;
    }

    // Override hashCode
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + " " + name;
    }
}

public class Q17 {
    public static void main(String[] args) {
        HashSet<Employee2> set = new HashSet<>();

        set.add(new Employee2(1, "Amit"));
        set.add(new Employee2(1, "Amit Duplicate")); // duplicate ID

        System.out.println(set);
    }
}