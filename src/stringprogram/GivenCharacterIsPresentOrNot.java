package stringprogram;

import java.util.Optional;
import java.util.Scanner;

public class GivenCharacterIsPresentOrNot {
    //Developer
    //i/p -> v
    //o/p -> given character is present
    private static final Integer VALUE = -1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String name = scan.next();
        System.out.println("Enter character");
        char character = scan.next().charAt(0);
        String string = printCharacterPresent(name, character);
        System.out.println(string);

    }

    private static String printCharacterPresent(String name, char character) {
        return Optional.of(name)
                .map(s -> name.indexOf(character))
                .filter(VALUE::equals)
                .map(print -> "Given character is not present " + character)
                .orElseGet(() -> "Given character is present " + character);
    }
}
