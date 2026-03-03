import java.util.*;

public class Question32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        int sum = 0;
        for (int num : nums)
            sum += num;

        if ((sum + target) % 2 != 0 || sum < Math.abs(target)) {
            System.out.println(0);
            sc.close();
            return;
        }

        int s = (sum + target) / 2;

        int[] dp = new int[s + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int i = s; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }

        System.out.println(dp[s]);

        sc.close();
    }
}