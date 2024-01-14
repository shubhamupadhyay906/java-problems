package javaeightprogram;

import java.util.Arrays;

public class LongestLengthOfString {
    public static void main(String[] args) {
        String[] string = {"Apple", "Banana", "Avocado", "Apricot", "Grapes"};

        int value = Arrays.stream(string).mapToInt(String::length).max().orElse(0);
        System.out.println(value);

        String index = string[0];
        for (int i = 0; i <= string.length - 1; i++) {
            if (index.length() < string[i].length()) {
                index = string[i];
            }
        }

        System.out.println(index+" "+index.length());

    }
}
