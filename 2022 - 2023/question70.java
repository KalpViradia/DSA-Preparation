import java.util.*;

public class question70 {

    public static int count(int n) {
        int[] fib = new int[32];
        fib[0] = 1;
        fib[1] = 2;

        for (int i = 2; i < 32; i++)
            fib[i] = fib[i - 1] + fib[i - 2];

        int ans = 0;
        int prevBit = 0;
        int k = 30;

        while (k >= 0) {
            if ((n & (1 << k)) != 0) {
                ans += fib[k];
                if (prevBit == 1) return ans;
                prevBit = 1;
            } else {
                prevBit = 0;
            }
            k--;
        }

        return ans + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Count = " + count(n));

        sc.close();
    }
}
