package Assignments;

public class Q5Main {
    public static void main(String[] args) {
        Q5 emp = new Q5();

        emp.setId(101);
        emp.setName("Sarvesh");
        emp.setSalary(50000);

        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}