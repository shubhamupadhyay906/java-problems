package arraysprogram;

import java.util.Scanner;

public class UniqueElements {
    //23|45|65|23|11|78|65|23|11|99
    //45, 78, 99
    //with count 45-1, 78-1, 99-1
    public static void main(String[] args) {
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
            for (int k = i; k >= 0; k--) {
                if (arr[k] == arr[i]) {
                    status++;
                }
            }
            if (status == 1 && count == 1) {
                System.out.println(arr[i] + " " + count);
            }
        }
    }
}

