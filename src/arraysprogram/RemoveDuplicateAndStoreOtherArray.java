package arraysprogram;

import java.util.Scanner;

public class RemoveDuplicateAndStoreOtherArray {
    public static void main(String[] args) {
        //arr1 -> 23|45|65|23|11|78|65|23|11|99
        //arr2 -> 23, 45, 65, 11, 78, 99
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = scanner.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        count = getCount(arr, count);
        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            int status = 0;
            for (int j = 0; j <= newArray.length - 1; j++) {
                if (arr[i] == newArray[j]) {
                    status = 1;
                    break;
                }
            }
            if (status == 0) {
                newArray[index] = arr[i];
                index++;
            }
        }
        System.out.println("New Array");
        for (int i = 0; i <= newArray.length - 1; i++) {
            System.out.print(newArray[i]+" ");
        }
    }

    private static int getCount(Integer[] arr, int count) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int status = 0;
            for (int k = i; k >= 0; k--) {
                if (arr[k] == arr[i]) {
                    status++;
                }
            }
            if (status == 1) {
                count++;
            }
        }
        return count;
    }
}
