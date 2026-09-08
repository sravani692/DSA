package Demo;

public class RecursiveBinarySearch {

    static int binarySearch(int[] arr, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, right, target);
        }
        else {
            return binarySearch(arr, left, mid - 1, target);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int target = 60;

        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1) {
            System.out.println("Element " + target +
                    " found at index " + result);
        }
        else {
            System.out.println("Element not found");
        }
    }
}

