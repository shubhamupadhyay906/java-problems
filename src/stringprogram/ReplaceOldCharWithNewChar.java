package stringprogram;

import java.util.Scanner;

public class ReplaceOldCharWithNewChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scanner.next();
        System.out.println("Enter character");
        char firstCharacter = scanner.next().charAt(0);
        System.out.println("Enter character to be replaced");
        char secondCharacter = scanner.next().charAt(0);
        String replacedString = string.replace(firstCharacter, secondCharacter);
        System.out.println(replacedString);
    }
}
