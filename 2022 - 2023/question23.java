import java.util.Scanner;

public class question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the size of array (max capacity): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input number of actual elements
        System.out.print("Enter number of elements currently in array: ");
        int size = sc.nextInt();

        if (size > n) {
            System.out.println("Number of elements cannot exceed array capacity!");
            sc.close();
            return;
        }

        // Input current elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element and position
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter the position to insert (1-based index): ");
        int pos = sc.nextInt();

        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position!");
            sc.close();
            return;
        }

        // Shift elements to the right to make space
        for (int i = size; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new element
        arr[pos - 1] = element;
        size++;  // Increase size

        // Display updated array
        System.out.println("Array after insertion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
