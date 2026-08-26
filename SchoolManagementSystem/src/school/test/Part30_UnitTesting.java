package school.test;

import school.service.Part2_DecisionMaking;

public class Part30_UnitTesting {
    public void testGradeCalculation() {
        Part2_DecisionMaking service = new Part2_DecisionMaking();
        char result = service.calculateGrade(85.0);
        if (result == 'A') {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
    }
}