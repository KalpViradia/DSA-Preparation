import java.util.*;

public class question52 {
    public static int sqrt(int x) {
        if (x < 2) return x;

        int low = 1, high = x, ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) mid * mid <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int x = sc.nextInt();

        System.out.println("Square root = " + sqrt(x));

        sc.close();
    }
}
