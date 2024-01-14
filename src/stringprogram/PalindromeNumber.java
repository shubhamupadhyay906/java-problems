package stringprogram;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int originalNumber = scanner.nextInt();
        int temp = originalNumber;
        int reverse = 0;
        int remainder;
        while (originalNumber > 0) {
            remainder = originalNumber % 10;//get remainder
            reverse = remainder + reverse * 10;
            originalNumber = originalNumber / 10;
        }
        if (temp == reverse) {
            System.out.println("Palindrome: " + reverse);
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
