package arraysprogram;

import java.util.Scanner;

public class SumOfAllElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = scan.nextInt();
        System.out.println("enter " + size + " elements");
        int sum = 0;
        int[] arr = new int[size];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of " + size + " elements" + ": " + sum);
        System.out.println("Average of " + size + " elements" + ": " + sum / size);
    }
}
