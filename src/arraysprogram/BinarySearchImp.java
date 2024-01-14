package arraysprogram;

public class BinarySearchImp {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 50;
        int n = arr.length;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("not present");
        } else {
            System.out.println("present " + result);
        }
    }

    static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = (l + r) / 2;
            //if the element is present at the middle itself
            if (arr[mid] == x) {
                return mid;
            }
            //if element is smaller than mid, then it can only be present
            //sub-array
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }
            //else element can only be present in right sub-array
            return binarySearch(arr, mid + 1, r, x);
        }
        //when element is not present in array
        return -1;
    }

}
