import java.util.*;

public class question76 {

    static final int MOD = 1000000007;

    public static int totalStrength(int[] a) {
        int n = a.length;

        long[] prefix = new long[n + 2];
        long[] prefix2 = new long[n + 2];

        for (int i = 1; i <= n; i++) {
            prefix[i] = (prefix[i - 1] + a[i - 1]) % MOD;
            prefix2[i] = (prefix2[i - 1] + prefix[i]) % MOD;
        }

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && a[st.peek()] > a[i]) st.pop();
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && a[st.peek()] >= a[i]) st.pop();
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            int l = left[i];
            int r = right[i];

            long leftCount = i - l;
            long rightCount = r - i;

            long totalRight = (prefix2[r] - prefix2[i] + MOD) % MOD;
            long totalLeft = (prefix2[i] - prefix2[l] + MOD) % MOD;

            long contrib = (a[i] * ((totalRight * leftCount % MOD - totalLeft * rightCount % MOD + MOD) % MOD)) % MOD;

            ans = (ans + contrib) % MOD;
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter strengths:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println("Total Strength = " + totalStrength(a));

        sc.close();
    }
}
