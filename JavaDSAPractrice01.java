// DSA Practice in Java
// Basic array and value manipulation functions

public class Main {

    /**
     * Swaps two integers without using a temporary variable.
     */
    static void swapWithoutTemp(int a, int b) {
        System.out.println("Original value a = " + a);
        System.out.println("Original value b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped value a = " + a);
        System.out.println("Swapped value b = " + b);
    }

    /**
     * Swaps two integers using a temporary variable.
     */
    static void swap(int a, int b) {
        System.out.println("Original value a = " + a);
        System.out.println("Original value b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped value a = " + a);
        System.out.println("Swapped value b = " + b);
    }

    /**
     * Prints the elements of the array.
     */
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     * Returns a new array that is the reverse of the input array.
     */
    static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            reversed[j++] = arr[i];
        }
        return reversed;
    }

    /**
     * Reverses the given array in place.
     */
    static void reverseArrayInPlace(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    /**
     * Rotates the array to the right by k positions.
     */
    static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] rotated = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            rotated[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            rotated[j++] = arr[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Swap examples
        // swap(3, 5);
        // swapWithoutTemp(53, 54);

        // Reverse array example
        // int[] reversed = reverseArray(arr);
        // printArray(reversed);

        // Reverse in-place
        // reverseArrayInPlace(arr);
        // printArray(arr);

        // Rotate array
        int[] rotated = rotateArray(arr, 3);
        System.out.print("Original array: ");
        printArray(arr);
        System.out.print("Rotated array: ");
        printArray(rotated);
    }
}
