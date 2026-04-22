package Assignments;

import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Insert
        q.add(10);
        q.add(20);
        q.add(30);

        // Display
        System.out.println("Queue: " + q);

        // Remove (FIFO)
        System.out.println("Removed: " + q.poll());

        // Peek
        System.out.println("Front: " + q.peek());

        System.out.println("Queue after operations: " + q);
    }
}