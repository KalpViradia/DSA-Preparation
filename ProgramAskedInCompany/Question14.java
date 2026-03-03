import java.util.*;

public class Question14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter " + n + " stock prices:");
        for (int i = 0; i < n; i++)
            prices[i] = sc.nextInt();

        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1])
                profit += prices[i] - prices[i - 1];
        }

        System.out.println(profit);

        sc.close();
    }
}