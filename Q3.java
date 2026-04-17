package Assignments;
public class Q3 {
    public static void main(String[] args) {
        String s = "Hello Java";

        System.out.println("Length: " + s.length());
        System.out.println("Upper: " + s.toUpperCase());
        System.out.println("Lower: " + s.toLowerCase());
        System.out.println("Substring: " + s.substring(0, 5));
        System.out.println("Replace: " + s.replace("Java", "World"));
        System.out.println("Contains: " + s.contains("Java"));
    }
}
