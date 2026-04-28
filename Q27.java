package Assignments;

public class Q27 {
    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                System.out.println("Thread using anonymous class");
            }
        };

        t1.start();
    }
}