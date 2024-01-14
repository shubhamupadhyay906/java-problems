package arraysprogram;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = scanner.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
         int value = Arrays.binarySearch(arr, 10);
        if (value>=0){
            System.out.println("Present "+ value);
        }else{
            System.out.println("Not present "+value);//-()
        }
    }
}
