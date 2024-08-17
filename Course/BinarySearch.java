
public class BinarySearch {

    public static int binarySearch(int num[], int key) {
        int start = 0, end = num.length - 1;
        // loop from start to end
        while (start <= end) {
            // find mid
            int mid = (start + end) / 2;
            // Compare mid with key
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] > key) { // Right
                end = mid - 1;
            } else {
                start = mid + 1; // Left
            }

        }
        return -1; // Invalid key
    }

    public static void main(String args[]) {

        int number[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 25;
        System.out.println("Index for key is : " + binarySearch(number, key));

    }
}
