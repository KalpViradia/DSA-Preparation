import java.util.Scanner;

public class question31 {

    // Shell Sort function
    public static void shellSort(int[] arr) {
        int n = arr.length;

        // Start with a big gap, then reduce it
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // Perform a gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                // Shift earlier gap-sorted elements up until the correct location for arr[i] is found
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calling shell sort
        shellSort(arr);

        // Output sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
