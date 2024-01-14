package stringprogram;

import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        if (str.length() <= 1) {
            return true;
        }
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        String substring = str.substring(1, str.length() - 1);//madam
        if (first == last) {
            return isPalindrome(substring); // Recursive case.
        }
        return false;
    }

}
