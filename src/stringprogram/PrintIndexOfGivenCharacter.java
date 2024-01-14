package stringprogram;

import java.util.Scanner;

public class PrintIndexOfGivenCharacter {
    //development
    //e
    //1,3,8
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String name = scan.nextLine();
        System.out.println("Enter character");
        char character = scan.next().charAt(0);
        for (int i = 0; i <= name.length() - 1; i++) {
            if (character == name.charAt(i)) {
                System.out.println(name.indexOf(character, i));
            }
        }
    }
}
