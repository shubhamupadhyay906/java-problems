package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 1, 6, 3};
        //time complexity = O(n^2)
        //bubble sort
        for (int i = 1; i <= arr.length - 1; i++) {//n-1
            for (int j = 0; j <= arr.length - 2; j++) {//
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
