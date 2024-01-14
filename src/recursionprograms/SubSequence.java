package recursionprograms;

public class SubSequence {
    public static void main(String[] args) {
        // abc ab ac a bc b c space
        String str = "abc";
        subSequence(str, 0, "");
    }

    private static void subSequence(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        subSequence(str, index + 1, newString + str.charAt(index));
        subSequence(str, index + 1, newString);
    }
}
