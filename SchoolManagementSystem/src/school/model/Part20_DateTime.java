package school.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Part20_DateTime {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2005, 5, 20);
        LocalDate today = LocalDate.now();

        int age = Period.between(dob, today).getYears();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date of Birth: " + dob.format(formatter));
        System.out.println("Calculated Age: " + age + " years");
    }
}