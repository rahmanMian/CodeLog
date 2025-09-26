import java.util.Arrays;

public class ArrayCheatSheet {

    public static void main(String[] args) {
        // ----------------------------
        // Array Declaration and Initialization
        // ----------------------------

        // 1D Array
        int[] arr; // Declaration
        arr = new int[5]; // Initialization with default values (0)
        int[] arrWithValues = {1, 2, 3, 4, 5}; // Declaration and Initialization

        // 2D Array
        int[][] matrix; // Declaration
        matrix = new int[3][4]; // Initialization with 3 rows and 4 columns
        int[][] matrixWithValues = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        }; // Declaration and Initialization

        // ----------------------------
        // Accessing Elements
        // ----------------------------

        // 1D Array
        arr[0] = 10; // Set first element
        int firstElement = arr[0]; // Get first element

        // 2D Array
        matrix[1][2] = 20; // Set element at row 2, column 3
        int element = matrix[1][2]; // Get element at row 2, column 3

        // ----------------------------
        // Array Length
        // ----------------------------

        int length1D = arr.length; // Length of 1D array
        int rows = matrix.length; // Number of rows in 2D array
        int cols = matrix[0].length; // Number of columns in 2D array (assuming at least one row)

        // ----------------------------
        // Traversing Arrays
        // ----------------------------

        // 1D Array - Traditional for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        // 1D Array - Enhanced for loop
        for (int value : arr) {
            System.out.println("Value: " + value);
        }

        // 2D Array - Nested for loops
        for (int i = 0; i < matrix.length; i++) { // Iterate over rows
            for (int j = 0; j < matrix[i].length; j++) { // Iterate over columns
                System.out.println("Element at [" + i + "][" + j + "]: " + matrix[i][j]);
            }
        }

        // 2D Array - Enhanced for loop
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.println("Value: " + value);
            }
        }

        // ----------------------------
        // Common Array Methods (java.util.Arrays)
        // ----------------------------

        // Sorting
        Arrays.sort(arr); // Sorts the array in ascending order

        // Searching
        //this cool
        int searchKey = 3;
        int index = Arrays.binarySearch(arr, searchKey); // Binary search (array must be sorted)
        System.out.println("Index of " + searchKey + ": " + index);

        // Copying
        int[] copyOfArr = Arrays.copyOf(arr, arr.length); // Creates a copy of the array
        int[] copyOfRange = Arrays.copyOfRange(arr, 1, 4); // Copies a range from index 1 to 3

        // Comparing
        boolean isEqual = Arrays.equals(arr, copyOfArr); // Checks if two arrays are equal
        System.out.println("Arrays are equal: " + isEqual);

        // Filling
        Arrays.fill(arr, 0); // Fills the entire array with 0
        Arrays.fill(matrix, new int[]{1, 1, 1, 1}); // Fills each row of the 2D array with 1s

        // Converting to String
        String arrString = Arrays.toString(arr); // Converts 1D array to String
        String matrixString = Arrays.deepToString(matrix); // Converts 2D array to String
        System.out.println("1D Array: " + arrString);
        System.out.println("2D Array: " + matrixString);

        // ----------------------------
        // Additional Array Utilities
        // ----------------------------

    }
}
