package school.test;

public class Part30_UnitTesting {

    public static boolean testAgeRequirement(int age) {
        return age >= 16;
    }

    public static void main(String[] args) {
        boolean passTest = testAgeRequirement(18);
        boolean failTest = testAgeRequirement(14);

        if (passTest && !failTest) {
            System.out.println("Unit Tests Execution: PASSED");
        } else {
            System.out.println("Unit Tests Execution: FAILED");
        }
    }
}