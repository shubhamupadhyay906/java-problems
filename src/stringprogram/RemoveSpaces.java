package stringprogram;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RemoveSpaces {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\s*[A-Z]\s*)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String word = scanner.nextLine();
        String newWord = word.trim();
        System.out.println(newWord);
    }
}
