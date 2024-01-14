package stringprogram;

import java.util.Scanner;

public class CountOfEachWord {
    //happy happy new year to you wish wish you the same
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scan.nextLine();
        String[] newStr = string.split(" ");
        for (int i = 0; i <= newStr.length - 1; i++) {
            int count = 0;
            for (int j = 0; j <= newStr.length - 1; j++) {
                if (newStr[i].equals(newStr[j])) {
                    count++;
                }
            }
            int status = 0;
            for (int k = i; k >= 0; k--) {
                if (newStr[i].equals(newStr[k])) {
                    status++;
                }
            }
            if (status == 1) {
                System.out.println(newStr[i] + " " + count);
            }
        }
    }
}
