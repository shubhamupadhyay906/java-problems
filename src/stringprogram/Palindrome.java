package stringprogram;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String reverse = "";
        //using stringbuilder to reverse
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string).reverse();
        System.out.println(stringBuilder);
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.charAt(i);
        }
        if (string.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
