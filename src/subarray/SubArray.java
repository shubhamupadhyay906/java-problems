package subarray;

import org.w3c.dom.ranges.Range;

import java.util.Arrays;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 3, 2, 4, 4, 8,111, 9};
        int K = 2;
        int length = arr.length - K;
        int max;
        int a = Arrays.stream(arr).filter(value -> value<=9).max().getAsInt();
        System.out.println(a);
//        Arrays.stream(arr).distinct().sorted();
//        for (int i = 0; i <= length; i++) {
//            max = arr[i];
//            for (int j = 1; j < K; j++) {
//                if (arr[i + j] > max) {
//                    max = arr[i + j];
//                }
//            }
//            System.out.println(max);
//        }
    }
}

