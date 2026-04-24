package Assignments;

import java.util.*;
import java.util.stream.*;

public class Q19
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        // Map (square)
        List<Integer> squares = list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // Reduce (sum)
        int sum = list.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

        // Count
        long count = list.stream()
                .filter(x -> x > 20)
                .count();
        System.out.println("Count >20: " + count);

        // Sort
        List<Integer> sorted = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted: " + sorted);
    }
}