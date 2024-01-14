package arraysprogram;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

public class GivenElementIsPresentOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = scanner.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter element to be searched");
        Integer element = scanner.nextInt();
//        for (int i=0;i<=arr.length-1;i++){
//            if(arr[i]==element){
//                System.out.println(arr[i]+"Present");
//                return;
//            }
//        }
//        System.out.println("Not present");
        boolean result = getData(arr, element);
        if (result){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }

    }

    private static boolean getData(Integer[] arr, Integer element) {
        return Arrays.asList(arr).contains(element);
    }
}
