package stringprogram;

import java.util.Scanner;

public class ReverseString {
    //Developer -> repoleveD
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = scan.next();
        StringBuilder reverse = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse.append(name.charAt(i));
        }
        System.out.println(reverse);
    }
}
