package Assignments;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Q9{

    public static void main(String[] args) {
        String dateStr1 = "2024-01-01";
        String dateStr2 = "2024-01-10";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate d1 = LocalDate.parse(dateStr1, formatter);
        LocalDate d2 = LocalDate.parse(dateStr2, formatter);

        // Date to String
        String formatted = d1.format(formatter);
        System.out.println("Formatted Date: " + formatted);

        // Days difference
        long days = ChronoUnit.DAYS.between(d1, d2);
        System.out.println("Days between: " + days);
    }
}
