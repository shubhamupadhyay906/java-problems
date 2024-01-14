package recursionprograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 5;
        reverse(n);
    }

    private static void reverse(int n) {
        while (n == 0) {
            return;
        }
        System.out.println(n);
        reverse(n - 1);
    }
}
