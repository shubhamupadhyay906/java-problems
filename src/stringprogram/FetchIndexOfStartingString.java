package stringprogram;

import java.util.Scanner;

public class FetchIndexOfStartingString {
    //development
    //lop
    //4
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String name = scan.nextLine();
        System.out.println("Enter character");
        String stringPattern = scan.next();
        int index = name.indexOf(stringPattern);
        System.out.println(index);
    }
}
