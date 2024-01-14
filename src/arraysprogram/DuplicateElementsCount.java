package arraysprogram;

import java.util.Scanner;

public class DuplicateElementsCount {
    public static void main(String[] args) {
        //23|45|65|23|11|78|65|23|11|99
        //23 3
        //65 2
        //11 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = scanner.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            int count = 0;
            for (int j = 0; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            int status = 0;
            for (int k = i; k >= 0; k--) {//23
                if (arr[k] == arr[i]) {
                    status++;
                }
            }
            if (count > 1 && status == 1) {
                System.out.println(arr[i] + " " + count);
            }
        }
    }
}
