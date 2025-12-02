import java.util.Scanner;

public class question27 {

    // Function to perform Counting Sort
    static void countingSort(int[] arr, int n) {
        // 1. Find the maximum element
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        // 2. Create count array
        int[] count = new int[max + 1];

        // 3. Store frequency of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // 4. Build the sorted array back into arr[]
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (non-negative integers):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call counting sort
        countingSort(arr, n);

        // Output
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
