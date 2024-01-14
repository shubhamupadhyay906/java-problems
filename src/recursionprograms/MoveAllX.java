package recursionprograms;

public class MoveAllX {
    public static String newString = "";
    public static String xString = "";

    public static void main(String[] args) {
        String str = "abxdxxe";
        System.out.println(moveAllX(str, 0));
    }

    private static String moveAllX(String str, int index) {
        if (index == str.length()) {
            return newString.concat(xString);
        }
        if ('x' != str.charAt(index)) {
            newString = newString + str.charAt(index);
        } else {
            xString = xString + str.charAt(index);
        }
        return moveAllX(str, index + 1);
    }
}
