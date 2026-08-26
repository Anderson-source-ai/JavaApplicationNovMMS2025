package school.service;

public class Part2_DecisionMaking {
    public boolean isEligible(int age) {
        return age >= 16;
    }

    public char calculateGrade(double score) {
        if (score >= 70) return 'A';
        if (score >= 60) return 'B';
        if (score >= 50) return 'C';
        return 'F';
    }
}