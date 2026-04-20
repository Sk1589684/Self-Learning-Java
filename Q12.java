package Assignments;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class InvalidSalaryException extends RuntimeException {
    InvalidSalaryException(String msg) {
        super(msg);
    }
}

public class Q12 {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Age must be >= 18");
    }

    static void checkSalary(double salary) {
        if (salary < 0)
            throw new InvalidSalaryException("Salary cannot be negative");
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Checked Exception: " + e.getMessage());
        }

        // ✅ Handle unchecked exception
        try {
            checkSalary(-1000);
        } catch (InvalidSalaryException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
