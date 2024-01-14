package recursionprograms;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcd";
        String reverse = reverseString(str);
        System.out.println(reverse);
    }

    private static String reverseString(String str) {
        if (str.length() == 0) {
            return "";
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

}
