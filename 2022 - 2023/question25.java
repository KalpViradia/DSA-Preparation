import java.util.Scanner;

public class question25 {

    // Recursive function to check if m is in array a[]
    static int isInArray(int a[], int m) {
        return isInArrayHelper(a, m, 0); // start recursion from index 0
    }

    // Helper function for recursion
    static int isInArrayHelper(int a[], int m, int index) {
        // Base case: end of array
        if (index == a.length) {
            return 0;   // not found
        }

        // If element found
        if (a[index] == m) {
            return 1;   // found
        }

        // Recurse for next index
        return isInArrayHelper(a, m, index + 1);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int m = sc.nextInt();

        int result = isInArray(arr, m);

        if (result == 1)
            System.out.println("Element is present in array.");
        else
            System.out.println("Element is NOT present in array.");

        sc.close();
    }
}
