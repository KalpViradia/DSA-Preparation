import java.util.*;

public class question74 {

    public static int maxTop(int[] nums, int k) {
        int n = nums.length;

        if (n == 1) return (k % 2 == 0) ? nums[0] : -1;

        int best = -1;

        for (int i = 0; i < Math.min(n, k - 1); i++)
            best = Math.max(best, nums[i]);

        if (k < n) best = Math.max(best, nums[k]);

        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter pile values:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Max top = " + maxTop(nums, k));

        sc.close();
    }
}
