import java.util.Scanner;

public class question39 {

    // Function to reverse part of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Rotate array to the right by k steps
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // handle cases where k > n

        // Step 1: Reverse whole array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter k steps to rotate right: ");
        int k = sc.nextInt();

        rotate(nums, k);

        // Output
        System.out.println("Array after rotation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
