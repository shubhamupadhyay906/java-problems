package recursionprograms;

public class StrictlySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5};
        System.out.println(isSorted(arr, 0));
    }

    private static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] >= arr[index + 1]) {
            return isSorted(arr, index + 1);
        }
        return false;
    }
}
