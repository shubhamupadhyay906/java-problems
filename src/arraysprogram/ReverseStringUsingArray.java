package arraysprogram;

public class ReverseStringUsingArray {
    public static void main(String[] args) {
        String s = "string";
        char[] chars = s.toCharArray();
        String s2 = "";
        for (int i = 0; i <= chars.length - 1; i++) {
            s2 = chars[i] + s2;
        }
        System.out.println(s2);
    }
}
