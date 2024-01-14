package arraysprogram;

import java.util.Scanner;

public class MissingNumberBetween1To100 {
    public static void main(String[] args) {
        System.out.println("enter array size");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i <= 10; i++) {
            int status = 0;
            for (int j = 0; j <= arr.length - 1; j++) {
                if (i == arr[j]) {
                    status = 1;
                    break;
                }
            }
            if (status == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
