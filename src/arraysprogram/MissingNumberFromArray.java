package arraysprogram;

public class MissingNumberFromArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 9, 10};

        int n = numbers[numbers.length - 1];
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            actualSum = actualSum + numbers[i];
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);
    }

}
