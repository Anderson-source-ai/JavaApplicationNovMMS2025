package school.exception;

class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}

public class Part14_Exceptions {

    public static void validateScore(double score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Score must be between 0 and 100.");
        }
        System.out.println("Valid score: " + score);
    }

    public static void main(String[] args) {
        try {
            validateScore(105.0);
        } catch (InvalidScoreException e) {
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Validation complete.");
        }
    }
}