import java.util.*;

public class Question9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target amount: ");
        int amount = sc.nextInt();
        System.out.print("Enter number of coin types: ");
        int n = sc.nextInt();

        int[] coins = new int[n];

        System.out.println("Enter " + n + " coin values:");
        for (int i = 0; i < n; i++)
            coins[i] = sc.nextInt();

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        if (dp[amount] > amount)
            System.out.println("Not Possible");
        else
            System.out.println("Minimum coins needed: " + dp[amount]);

        sc.close();
    }
}