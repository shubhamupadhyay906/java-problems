package recursionprograms;

public class SumNumbers {
    public static void main(String[] args) {
        //n = 10;
        //output = 55
        int n = 9;
        int sum = printSum(n);
        System.out.println(sum);
    }

    private static int printSum(int n) {
        if (n == 0) {
            return 0;
        }
        return printSum((n - 1)) + n;
    }

}
