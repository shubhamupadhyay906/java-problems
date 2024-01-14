package stringprogram;

import java.util.Scanner;

public class FetchIndexNumberBasedOnGivenCharacter {
    //Developer
    //i/p -> e
    //o/p -> 3

    public static void main(String[] args) {

        System.out.println("Enter the String");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Enter Character");
        char character = scan.next().charAt(0);
        int index = name.indexOf(character);
        System.out.println(index);
    }
}
