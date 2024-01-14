package stringprogram;

import java.util.Scanner;

public class RemoveDuplicates {
    //java developer
    //jav devlopr
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scan.nextLine();
        String newString = "";
        String dup = "";
        for (int i = 0; i <= string.length() - 1; i++) {
            char character = string.charAt(i);
            int index = newString.indexOf(character);
            if (index == -1) {
                newString = newString + character;
            } else {
                dup = dup + character;
            }
        }
        System.out.println("unique character string: " + newString);// unique character
        System.out.println("unique character string: " + dup);// duplicate characters
    }
}
