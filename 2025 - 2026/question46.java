import java.util.Scanner;

public class question46 {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 0, right = x, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int x = sc.nextInt();

        int sqrt = mySqrt(x);
        System.out.println("Integer square root of " + x + " is: " + sqrt);

        sc.close();
    }
}
