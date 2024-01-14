package arraysprogram;

import java.util.Scanner;

public class PrintEachElementsOnlyOnce {
    public static void main(String[] args) {
        //23|45|65|23|11|78|65|23|11|99
        //23, 45, 65, 11, 78, 99
        //2nd o/p count 6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = scanner.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        // int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            int status = 0;
            for (int k = i; k >= 0; k--) {
                if (arr[k] == arr[i]) {
                    status++;
                }
            }
            if (status == 1) {
                System.out.println(arr[i] + " ");
            }
//            if (status == 1) {
//                count++;
//            }
//            System.out.println(count);
        }

    }
}
