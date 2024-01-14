package exceptionexp;

public class Main {
    public static void main(String[] args) {
        try {
            validate(13);
        } catch (InvalidAgeException ex) {
            System.out.println("Exception occured: " + ex);
        }
    }

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("age is not valid to vote");
        } else {
            System.out.println("welcome to vote");
        }
    }

}
