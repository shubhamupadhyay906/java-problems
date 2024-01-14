package arraysprogram;

import java.util.Scanner;

public class EvenIndexNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = scanner.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Even Numbers-----");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
