import java.util.*;

public class question55 {

    static int[][][] dp;

    static int solve(int[] b, int l, int r, int k) {
        if (l > r) return 0;
        if (dp[l][r][k] != -1) return dp[l][r][k];

        int res = solve(b, l, r - 1, 0) + (k + 1) * (k + 1);

        for (int i = l; i < r; i++) {
            if (b[i] == b[r]) {
                res = Math.max(res, solve(b, l, i, k + 1) + solve(b, i + 1, r - 1, 0));
            }
        }

        return dp[l][r][k] = res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] boxes = new int[n];
        System.out.println("Enter box colors:");
        for (int i = 0; i < n; i++) boxes[i] = sc.nextInt();

        dp = new int[n][n][n];
        for (int[][] d1 : dp)
            for (int[] d2 : d1)
                Arrays.fill(d2, -1);

        System.out.println("Maximum Points = " + solve(boxes, 0, n - 1, 0));

        sc.close();
    }
}
