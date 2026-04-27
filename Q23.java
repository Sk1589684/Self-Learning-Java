package Assignments;

class Q23 {
    public static void main(String[] args) {
        final Object r1 = "Resource1";
        final Object r2 = "Resource2";

        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println("Thread1 locked r1");
                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (r2) {
                    System.out.println("Thread1 locked r2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println("Thread2 locked r2");
                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (r1) {
                    System.out.println("Thread2 locked r1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
