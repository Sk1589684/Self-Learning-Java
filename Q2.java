package Assignments;

public class Q2 {
    public static void main(String[] args) {
        Integer num = 100;

        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Max: " + Integer.max(10, 20));
        System.out.println("Min: " + Integer.min(10, 20));
        System.out.println("Compare: " + Integer.compare(10, 20));

        String str = "123";
        int parsed = Integer.parseInt(str);
        System.out.println("Parsed: " + parsed);
    }
}