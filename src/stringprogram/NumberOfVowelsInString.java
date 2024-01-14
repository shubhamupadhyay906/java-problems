package stringprogram;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;

public class NumberOfVowelsInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scan.nextLine();
        Pattern vowels = Pattern.compile("([aeiou])");
        int count=0;
        for (int i=0;i<string.length();i++){
            char character = string.charAt(i);
            if (vowels.matcher(valueOf(character)).matches()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
