import java.util.Scanner;

public class question21 {

    // Function to get maximum value in array
    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    // Function to do counting sort according to digit represented by exp
    static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // For digits 0-9

        // Count occurrences of each digit
        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // Change count[i] so that count[i] contains actual position of digit in output[]
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy output back to arr[]
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // Main function to do radix sort
    static void radixSort(int[] arr) {
        int max = getMax(arr);

        // Apply counting sort to each digit
        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, exp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements (positive integers):");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Sort array
        radixSort(arr);

        // Display sorted array
        System.out.println("Sorted array:");
        for (int num : arr)
            System.out.print(num + " ");

        sc.close();
    }
}
