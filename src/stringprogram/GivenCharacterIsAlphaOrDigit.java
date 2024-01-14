package stringprogram;

import java.util.Optional;
import java.util.Scanner;

public class GivenCharacterIsAlphaOrDigit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter character");
        char character = scan.next().charAt(0);
        String string  = Optional.of(character)
                .filter(Character::isAlphabetic)
                .map(print-> "Given character is alphabetic")
                .orElseGet(()-> isCharaterDigit(character));
        System.out.println(string);
    }

    private static String isCharaterDigit(char character) {
        return Optional.of(character)
                .filter(Character::isDigit)
                .map(print-> "Given character is digit")
                .orElseGet(()-> "Given character is special symbol");
    }
}
