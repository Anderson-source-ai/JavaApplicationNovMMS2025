package school.service;

import java.util.List;
import java.util.function.Predicate;

public class Part18_Lambdas {
    public static void main(String[] args) {
        List<Double> scores = List.of(45.0, 78.5, 90.0, 33.0);

        Predicate<Double> isPassing = score -> score >= 50.0;

        for (double score : scores) {
            if (isPassing.test(score)) {
                System.out.println("Passing score: " + score);
            }
        }
    }
}