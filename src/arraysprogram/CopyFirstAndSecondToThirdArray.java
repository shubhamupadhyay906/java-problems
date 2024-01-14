package arraysprogram;

import java.util.Scanner;

public class CopyFirstAndSecondToThirdArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = scanner.nextInt();
        Integer[] arr1 = new Integer[size];
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = scanner.nextInt();
        }
        Integer[] arr2 = new Integer[size];
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = scanner.nextInt();
        }
        Integer[] arr3 = new Integer[size + size];
        System.arraycopy(arr1, 0, arr3, 0, size);
        System.arraycopy(arr2, 0, arr3, size, size);
        for (int i = 0; i <= arr3.length - 1; i++) {
            System.out.println(arr3[i]);
        }
    }
}
