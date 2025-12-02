import java.util.Scanner;

public class question40 {

    public static boolean checkPossibility(int[] nums) {
        int count = 0;  // number of modifications needed

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] > nums[i + 1]) {  // violation
                count++;

                if (count > 1) return false; // more than one change needed

                // Decide what to modify
                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i + 1];  // lower nums[i]
                } else {
                    nums[i + 1] = nums[i];  // raise nums[i+1]
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = checkPossibility(nums);

        System.out.println("Can become non-decreasing with ≤1 modification? " + result);

        sc.close();
    }
}
