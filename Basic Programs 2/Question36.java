import java.util.*;

public class Question36 {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        long[] strength = new long[n];

        System.out.println("Enter " + n + " strength values:");
        for (int i = 0; i < n; i++)
            strength[i] = sc.nextLong();

        long[] prefix = new long[n + 1];
        long[] prefixOfPrefix = new long[n + 2];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = (prefix[i] + strength[i]) % MOD;
            prefixOfPrefix[i + 1] = (prefixOfPrefix[i] + prefix[i + 1]) % MOD;
        }

        Stack<Integer> stack = new Stack<>();
        long result = 0;

        for (int right = 0; right <= n; right++) {

            long curr = (right < n) ? strength[right] : 0;

            while (!stack.isEmpty() &&
                    (right == n || strength[stack.peek()] >= curr)) {

                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();

                long totalRight = (prefixOfPrefix[right] - prefixOfPrefix[mid] + MOD) % MOD;
                long totalLeft = (prefixOfPrefix[mid] - (left >= 0 ? prefixOfPrefix[left] : 0) + MOD) % MOD;

                long rightCount = right - mid;
                long leftCount = mid - left;

                long contribution =
                        strength[mid] *
                        ((totalRight * leftCount % MOD - totalLeft * rightCount % MOD + MOD) % MOD)
                        % MOD;

                result = (result + contribution) % MOD;
            }

            stack.push(right);
        }

        System.out.println(result);

        sc.close();
    }
}