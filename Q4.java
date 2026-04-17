package Assignments;

public class Q4 {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat(" World"); // immutable
        System.out.println("String: " + s);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // mutable
        System.out.println("StringBuffer: " + sb);

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        System.out.println("StringBuilder: " + sb2);
    }
}