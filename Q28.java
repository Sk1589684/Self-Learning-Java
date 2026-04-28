package Assignments;

public class Q28 {
    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            System.out.println("Thread using lambda");
        });

        t.start();
    }
}
