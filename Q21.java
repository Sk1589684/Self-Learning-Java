package Assignments;

class Task implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " same task");
    }
}

class Task1 implements Runnable {
    public void run() {
        System.out.println("Task1 running");
    }
}

class Task2 implements Runnable {
    public void run() {
        System.out.println("Task2 running");
    }
}

public class Q21 {
    public static void main(String[] args) {

        // Same task
        Task task = new Task();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        // Different tasks
        new Thread(new Task1()).start();
        new Thread(new Task2()).start();
    }
}