package Assignments;

public class Q1 {
	
	    public static void main(String[] args) {
	        int a = 10;

	        // Boxing (primitive → object)
	        Integer obj = Integer.valueOf(a);
	        Integer obj2 = a; // Auto-boxing

	        // Unboxing (object → primitive)
	        int b = obj.intValue();
	        int c = obj2; // Auto-unboxing

	        System.out.println("Boxed: " + obj + ", " + obj2);
	        System.out.println("Unboxed: " + b + ", " + c);
	    }
	}

