package arraysprogram;

import java.util.Scanner;

public class FirstBiggestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = scanner.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        Integer temp = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        System.out.println("Greatest element: " + temp);

    }
}
