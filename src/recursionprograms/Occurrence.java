package recursionprograms;

public class Occurrence {
    public static int first = -1;
    public static int last = -1;

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurrence(str, 0, 'a');
    }

    private static void findOccurrence(String str, int index, char element) {
        if (index == str.length()) {
            System.out.println(first + " " + last);
            return;
        }
        if (str.charAt(index) == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findOccurrence(str, index + 1, element);
    }
}
