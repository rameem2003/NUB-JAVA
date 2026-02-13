package BinarySearch;

// Class for searching logic
class Searching {

    // Method to perform binary search
    int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid; // Element found
            } else if (arr[mid] < key) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return -1; // Element not found
    }
}

// Class containing main method
class BinarySearch {

    public static void main(String[] args) {

        // Binary search works on sorted arrays
        int[] numbers = { 10, 20, 30, 40, 50, 60 };
        int key = 40;

        Searching s = new Searching();

        int result = s.binarySearch(numbers, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
