import java.util.Scanner;

public class question23 {
    // Function to rotate array to the right by k steps
    public static void rotateRight(int[] arr, int k) {
        reverse(arr, 0, arr.length - 1);      // Step 1: Reverse the whole array
        reverse(arr, 0, k - 1);              // Step 2: Reverse first k elements
        reverse(arr, k, arr.length - 1);     // Step 3: Reverse remaining elements
    }

    // Helper function to reverse part of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt();

        // Handle cases where k > n
        k = k % n;

        // Rotate the array
        rotateRight(arr, k);

        // Print rotated array
        System.out.println("Array after rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
