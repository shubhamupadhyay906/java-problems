package stringprogram;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Heart";
        String s2 = "Earth";
        String message = checkAnagram(s1, s2);
        System.out.println(message);
    }

    private static String checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return "Not a Anagram";
        }
        char[] char1 = s1.toLowerCase().toCharArray();
        char[] char2 = s2.toLowerCase().toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1, char2) ? "Anagram" : "not a Anagram";
    }
}
