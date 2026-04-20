package Assignments;

import java.util.*;

public class Q10{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Insert
        list.add(10);
        list.add(20);
        list.add(30);

        // Delete
        list.remove(Integer.valueOf(20));

        // Search
        System.out.println("Contains 10: " + list.contains(10));

        // Iterate
        for (Integer i : list) {
            System.out.println(i);
        }

        // Sort
        Collections.sort(list);
        System.out.println("Sorted: " + list);
    }
}