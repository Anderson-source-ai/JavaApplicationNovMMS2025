package school.service;

import java.util.List;

public class Part19_StreamAPI {
    public static void main(String[] args) {
        List<Double> gpas = List.of(3.2, 3.9, 2.4, 3.7);

        double averageGpa = gpas.stream()
                .filter(gpa -> gpa >= 3.0)
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Average GPA of Honor Students: " + averageGpa);
    }
}