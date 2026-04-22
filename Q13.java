package Assignments;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Q13 {

    public static void main(String[] args) {
        String d1Str = "2024-01-01";
        String d2Str = "2024-01-15";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // String → Date
        LocalDate d1 = LocalDate.parse(d1Str, formatter);
        LocalDate d2 = LocalDate.parse(d2Str, formatter);

        // Date → String
        String formatted = d1.format(formatter);
        System.out.println("Formatted Date: " + formatted);

        // Days difference
        long days = ChronoUnit.DAYS.between(d1, d2);
        System.out.println("Days between: " + days);
    }
}