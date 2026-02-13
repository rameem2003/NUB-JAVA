package TestSorting;

// Class for sorting logic
class Sorting {

    // Method to perform bubble sort
    void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

// Class containing main method
class TestSorting {

    public static void main(String[] args) {

        // Step 4: Take input into an array
        int[] numbers = { 45, 12, 78, 34, 23, 10 };

        Sorting s = new Sorting();

        // Step 5: Sort the array using bubble sort
        s.bubbleSort(numbers);

        // Step 6: Display the sorted list
        System.out.println("Sorted list of numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
