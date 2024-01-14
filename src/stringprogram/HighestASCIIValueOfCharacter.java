package stringprogram;

import java.util.Scanner;

public class HighestASCIIValueOfCharacter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scan.nextLine();
        char char1 = string.charAt(0);
        for (int i = 0; i <= string.length() - 1; i++) {
            char char2 = string.charAt(i);
            if ((int) char2 > (int) char1) {
                char1 = char2;
            }
        }
        System.out.println(char1 + ": " + (int) char1);

    }
}
