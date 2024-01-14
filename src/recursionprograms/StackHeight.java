package recursionprograms;

public class StackHeight {
    public static void main(String[] args) {
        //x^n - 2^5 = 32
        int x = 5, n = 3;
        int stackHeight = calculateHeight(x, n);
        System.out.println(stackHeight);
    }

    private static int calculateHeight(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return calculateHeight(x, n - 1) * x;

    }

}
