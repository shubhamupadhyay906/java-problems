package stringprogram;

import java.util.Scanner;

public class SortSentence {
    public static void main(String[] args) {
        //wish you happy new year
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scan.nextLine();
        String[] newStr = string.split(" ");
        for (int cycle = 1; cycle <= newStr.length - 1; cycle++) {
            for (int i = 0; i <= newStr.length - 2; i++) {
                if (newStr[i].compareTo(newStr[i + 1]) > 0) {
                    String temp = newStr[i];
                    newStr[i] = newStr[i + 1];
                    newStr[i + 1] = temp;
                }
            }
        }
        System.out.println("sorted string array");
        for (int i = 0; i <= newStr.length - 1; i++) {
            System.out.print(newStr[i]+" ");
        }
    }
}

