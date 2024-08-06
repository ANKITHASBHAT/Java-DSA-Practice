public class Linear_Search {
    // Method to perform linear search
    public static int linearSearch(int[] array, int target) {
        // Traverse the array
        for (int i = 0; i < array.length; i++) {
            // Check if current element matches the target
            if (array[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 20, 30, 40, 50, 60};

        // Target value to search for
        int target = 30;

        // Perform linear search
        int result = linearSearch(numbers, target);

        // Print the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
