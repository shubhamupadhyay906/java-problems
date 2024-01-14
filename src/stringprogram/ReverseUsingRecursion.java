package stringprogram;

import java.util.Scanner;

public class ReverseUsingRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Reversed string: " + reverse(s));
    }

    public static String reverse(String str) {//hello
        if (str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}

//html
//tml+h
//ml+t+h
//m+l+t+h
