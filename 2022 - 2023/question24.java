import java.util.Scanner;

public class question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to delete
        System.out.print("Enter element to delete: ");
        int x = sc.nextInt();

        // Search element
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                pos = i;
                break;
            }
        }

        // If not found
        if (pos == -1) {
            System.out.println("Element is not found");
        } else {
            // Shift elements left
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; // reduce effective size

            // Print updated array
            System.out.println("Array after deletion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
