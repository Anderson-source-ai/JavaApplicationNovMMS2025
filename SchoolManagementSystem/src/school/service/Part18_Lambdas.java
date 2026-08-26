package school.service;

import java.util.List;

public class Part18_Lambdas {
    public void printPassingScores(List<Double> scores) {
        scores.forEach(s -> {
            if (s >= 50) System.out.println("Pass: " + s);
        });
    }
}