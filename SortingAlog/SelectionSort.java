 public class SelectionSort {

        // Method to perform selection sort
        public static void selectionSort(int[] arr) {
            int n = arr.length;
    
            // Traverse through all array elements
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in remaining unsorted array
                int minIdx = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIdx]) {
                        minIdx = j;
                    }
                }
    
                // Swap the found minimum element with the first element
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
    
        // Main method to test the selection sort algorithm
        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11};
            System.out.println("Unsorted array:");
            printArray(arr);
    
            selectionSort(arr);
    
            System.out.println("Sorted array:");
            printArray(arr);
        }
    
        // Method to print the elements of an array
        public static void printArray(int[] arr) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
}
