package Assignments;

import java.util.*;

//Employee class implementing Comparable
class Employee implements Comparable<Employee> {
 int id;
 String name;
 double salary;

 Employee(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }

 // Comparable (sort by salary)
 public int compareTo(Employee e) {
     return Double.compare(this.salary, e.salary);
 }

 public String toString() {
     return id + " " + name + " " + salary;
 }
}

//Comparator (sort by name)
class NameComparator implements Comparator<Employee> {
 public int compare(Employee e1, Employee e2) {
     return e1.name.compareTo(e2.name);
 }
}

//Comparator (sort by id)
class IdComparator implements Comparator<Employee> {
 public int compare(Employee e1, Employee e2) {
     return e1.id - e2.id;
 }
}

public class Q11 {
 public static void main(String[] args) {
     List<Employee> list = new ArrayList<>();

     list.add(new Employee(3, "Amit", 50000));
     list.add(new Employee(1, "Ravi", 30000));
     list.add(new Employee(2, "Neha", 40000));

     // Comparable sorting (by salary)
     Collections.sort(list);
     System.out.println("Sorted by Salary:");
     list.forEach(System.out::println);

     // Comparator sorting (by name)
     Collections.sort(list, new NameComparator());
     System.out.println("\nSorted by Name:");
     list.forEach(System.out::println);

     // Comparator sorting (by id)
     Collections.sort(list, new IdComparator());
     System.out.println("\nSorted by ID:");
     list.forEach(System.out::println);
 }
}