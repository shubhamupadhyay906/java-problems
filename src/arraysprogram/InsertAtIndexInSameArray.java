package arraysprogram;

import java.util.Scanner;

public class InsertAtIndexInSameArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = scanner.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter index");
        int index = scanner.nextInt();
        System.out.println("Enter new element");
        int newElement = scanner.nextInt();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (index == i) {
                arr[index] = newElement;
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
