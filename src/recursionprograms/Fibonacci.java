package recursionprograms;

public class Fibonacci {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21 34
        int first = 0, second = 1, n = 10;
        System.out.print(first + " " + second + " ");
        fibonacciSeries(first, second, n - 2);
    }

    private static void fibonacciSeries(int first, int second, int n) {
        if (n == 0) {
            return;
        }
        int sum = first + second;
        System.out.print(sum+" ");
        first = second;
        second = sum;
        fibonacciSeries(first, second, n - 1);
    }
}
