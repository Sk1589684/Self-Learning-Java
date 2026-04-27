package Assignments;

class Shared {
    synchronized void produce() throws Exception {
        System.out.println("Producer waiting...");
        wait(); // release lock

        System.out.println("Producer resumed");
    }

    synchronized void consume() {
        System.out.println("Consumer executing...");
        notify(); // wake one thread
    }
}

public class Q24 {
    public static void main(String[] args) {

        Shared obj = new Shared();

        Thread t1 = new Thread(() -> {
            try {
                obj.produce();
            } catch (Exception e) {}
        });

        Thread t2 = new Thread(() -> {
            try { Thread.sleep(1000); } catch (Exception e) {}
            obj.consume();
        });

        t1.start();
        t2.start();
    }
}