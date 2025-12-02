import java.util.*;

public class question71 {

    static int solve(int[] nums, int target) {
        int sum = 0;
        for (int n : nums) sum += n;

        if (target > sum || target < -sum) return 0;

        int offset = sum;
        int dp[][] = new int[nums.length + 1][2 * sum + 1];

        dp[0][offset] = 1;

        for (int i = 1; i <= nums.length; i++) {
            for (int s = -sum; s <= sum; s++) {
                if (dp[i - 1][s + offset] != 0) {
                    dp[i][s + nums[i - 1] + offset] += dp[i - 1][s + offset];
                    dp[i][s - nums[i - 1] + offset] += dp[i - 1][s + offset];
                }
            }
        }
        return dp[nums.length][target + offset];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        System.out.print("Enter target: ");
        int t = sc.nextInt();

        System.out.println("Ways = " + solve(nums, t));

        sc.close();
    }
}
