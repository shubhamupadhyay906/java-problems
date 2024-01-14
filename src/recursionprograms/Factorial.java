package recursionprograms;

public class Factorial {
    public static void main(String[] args) {
        int n = 1;
        int sum = fact(n);
        System.out.println(sum);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
