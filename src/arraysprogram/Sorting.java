package arraysprogram;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = scanner.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int cycle = 1; cycle <= arr.length - 1; cycle++) {
            for (int i = 0; i <= arr.length - 2; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
