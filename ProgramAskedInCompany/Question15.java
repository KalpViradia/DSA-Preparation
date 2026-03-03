import java.util.*;

public class Question15 {

    static boolean isValid(int mask, int prevMask, char[] row) {

        for (int i = 0; i < row.length; i++) {

            if ((mask & (1 << i)) != 0) {

                if (row[i] == '#') return false;

                if (i > 0 && (mask & (1 << (i - 1))) != 0)
                    return false;

                if ((prevMask & (1 << (i - 1))) != 0)
                    return false;

                if (i < row.length - 1 &&
                    (prevMask & (1 << (i + 1))) != 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        System.out.print("Enter columns: ");
        int n = sc.nextInt();
        sc.nextLine();

        char[][] seats = new char[m][n];

        System.out.println("Enter " + m + " rows of seat layout (. for good, # for broken):");
        for (int i = 0; i < m; i++)
            seats[i] = sc.nextLine().toCharArray();

        int[] dp = new int[1 << n];
        int max = 0;

        for (int i = 0; i < m; i++) {

            int[] newDp = new int[1 << n];

            for (int mask = 0; mask < (1 << n); mask++) {

                if (!isValid(mask, 0, seats[i]))
                    continue;

                int count = Integer.bitCount(mask);

                for (int prev = 0; prev < (1 << n); prev++) {

                    if (isValid(mask, prev, seats[i])) {
                        newDp[mask] = Math.max(newDp[mask],
                                dp[prev] + count);
                        max = Math.max(max, newDp[mask]);
                    }
                }
            }
            dp = newDp;
        }

        System.out.println(max);

        sc.close();
    }
}