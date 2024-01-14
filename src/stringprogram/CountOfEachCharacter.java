package stringprogram;

import java.util.Scanner;

public class CountOfEachCharacter {
    //java
    //j-1
    //a-2
    //v-1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scanner.next();
        String uniqueWord = uniqueCharacterWord(string);
        for (int i = 0; i <= uniqueWord.length() - 1; i++) {
            int count = 0;
            for (int j = 0; j <= string.length() - 1; j++) {
                if (uniqueWord.charAt(i) == string.charAt(j)) {
                    count++;
                }
            }
            System.out.println(uniqueWord.charAt(i) + ": " + count);
        }
    }

    private static String uniqueCharacterWord(String string) {
        String uniqueCharacter = "";
        for (int i = 0; i <= string.length() - 1; i++) {
            char ch = string.charAt(i);
            int index = uniqueCharacter.indexOf(ch);
            if (index == -1) {
                uniqueCharacter = uniqueCharacter + ch;
            }
        }
        return uniqueCharacter;
    }
}
