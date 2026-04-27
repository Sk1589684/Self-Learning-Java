package Assignments;

class MyThreadDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            
            try {
                Thread.sleep(500); // pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread.yield(); // give chance to other threads
        }
    }
}

public class Q22
{
    public static void main(String[] args) throws Exception {
        MyThreadDemo t1 = new MyThreadDemo();
        MyThreadDemo t2 = new MyThreadDemo();

        t1.start();
        t1.join(); // wait for t1 to finish

        t2.start();
    }
}