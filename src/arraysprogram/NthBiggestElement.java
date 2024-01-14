package arraysprogram;

import java.util.Scanner;

public class NthBiggestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = scanner.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter highest element to be printed");
        int highest = scanner.nextInt();
        //using inbuilt method
//        Arrays.sort(arr);
//        System.out.println("2nd biggest number"+ arr[size-highest]);

        //using bubble sorting method
//        int temp;
//        for (int cycle = 1; cycle <= arr.length - 1; cycle++) {//N elements //N-1 cycle
//            for (int j = 0; j <= arr.length - 2; j++) {//N elements //N-1 components
//                if (arr[j] > arr[j + 1]) {//11//14
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i <= arr.length - 1; i++) {
//            System.out.println(arr[i]);
//        }

        for (int i = 0; i <= arr.length - 1; i++) {
            int count = 0;
            for (int j = 0; j <= arr.length - 1; j++) {
                if (arr[i] <= arr[j]) {
                    count++;
                }
            }
            if (count == highest) {
                System.out.println(highest + "nd biggest element: " + arr[i]);
                break;
            }
        }
    }
}
