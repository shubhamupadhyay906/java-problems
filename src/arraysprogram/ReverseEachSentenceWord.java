package arraysprogram;

import java.util.Scanner;

public class ReverseEachSentenceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string");
        String string = scanner.nextLine();
        String[] s = string.split(" ");
        String s2 = "";
        for (int i = 0; i <= s.length - 1; i++) {
            s2 = s2 + " " +getReverseWord(s[i]);
        }
        System.out.println(s2.trim());

    }

    private static String getReverseWord(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }
}
