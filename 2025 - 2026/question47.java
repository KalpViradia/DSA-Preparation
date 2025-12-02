import java.util.Scanner;

public class question47 {

    public static int removeBoxes(int[] boxes) {
        int n = boxes.length;
        int[][][] dp = new int[n][n][n];
        return helper(boxes, 0, n - 1, 0, dp);
    }

    private static int helper(int[] boxes, int l, int r, int k, int[][][] dp) {
        if (l > r) return 0;
        if (dp[l][r][k] != 0) return dp[l][r][k];

        // Optimize: combine consecutive boxes of same color at the end
        while (r > l && boxes[r] == boxes[r - 1]) {
            r--;
            k++;
        }

        // Option 1: remove last k+1 boxes directly
        dp[l][r][k] = helper(boxes, l, r - 1, 0, dp) + (k + 1) * (k + 1);

        // Option 2: merge non-adjacent boxes with same color
        for (int i = l; i < r; i++) {
            if (boxes[i] == boxes[r]) {
                dp[l][r][k] = Math.max(dp[l][r][k],
                        helper(boxes, l, i, k + 1, dp) + helper(boxes, i + 1, r - 1, 0, dp));
            }
        }

        return dp[l][r][k];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of boxes: ");
        int n = sc.nextInt();
        int[] boxes = new int[n];

        System.out.println("Enter colors of the boxes:");
        for (int i = 0; i < n; i++) {
            boxes[i] = sc.nextInt();
        }

        int maxPoints = removeBoxes(boxes);
        System.out.println("Maximum points: " + maxPoints);

        sc.close();
    }
}
