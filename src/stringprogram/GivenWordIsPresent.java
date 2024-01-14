package stringprogram;

import java.util.Scanner;

public class GivenWordIsPresent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scan.nextLine();
        System.out.println("Enter character");
        String search = scan.next();
        if (string.contains(search)) {
            System.out.println("Present");
        } else {
            System.out.println("not present");
        }

    }
}
