package Assignments;

import java.util.*;

public class Q14 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Insert
        list.add(50);
        list.add(10);
        list.add(30);

        // Delete
        list.remove(Integer.valueOf(10));

        // Search
        System.out.println("Contains 50: " + list.contains(50));

        // Iterate
        System.out.println("Elements:");
        for (Integer i : list) {
            System.out.println(i);
        }

        // Sort
        Collections.sort(list);
        System.out.println("Sorted: " + list);
    }
}