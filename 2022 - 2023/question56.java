import java.util.*;

public class question56 {

    public static int minimumAverageDifference(int[] nums) {
        long total = 0;
        for (int x : nums) total += x;

        long leftSum = 0;
        int n = nums.length;
        int bestIndex = 0;
        long bestDiff = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            leftSum += nums[i];
            long rightSum = total - leftSum;

            long leftAvg = leftSum / (i + 1);
            long rightAvg = (i == n - 1) ? 0 : (rightSum / (n - i - 1));

            long diff = Math.abs(leftAvg - rightAvg);
            if (diff < bestDiff) {
                bestDiff = diff;
                bestIndex = i;
            }
        }

        return bestIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        System.out.println("Index = " + minimumAverageDifference(nums));

        sc.close();
    }
}
