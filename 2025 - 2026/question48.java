import java.util.Scanner;

public class question48 {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place numbers in correct positions
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] and nums[nums[i]-1]
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Step 2: Find the first index where nums[i] != i+1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) return i + 1;
        }

        // Step 3: All numbers 1..n are in place
        return n + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int missing = firstMissingPositive(nums);
        System.out.println("First missing positive: " + missing);

        sc.close();
    }
}
