package stringprogram;

import java.util.Scanner;

public class ConvertStringTOCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string");
        String string = scanner.next();
        char[] characters = new char[string.length()];
        for (int i = 0; i <= string.length() - 1; i++) {
            characters[i] = string.charAt(i);
        }
        for (int i = 0; i <= characters.length-1; i++) {
            System.out.println(characters[i]);
        }
    }
}
