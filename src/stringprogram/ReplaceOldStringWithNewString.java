package stringprogram;

import java.util.Scanner;

public class ReplaceOldStringWithNewString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String word = scanner.next();
        System.out.println("Enter original string to replace");
        String oldString = scanner.next();
        System.out.println("Enter the string to be replace with");
        String newString = scanner.next();
        String modifiedWord = word.replace(oldString, newString);
        System.out.println(word);
        System.out.println(modifiedWord);
    }
}
