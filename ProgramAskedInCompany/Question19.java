import java.util.*;

public class Question19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        int left = 0, right = x;
        int ans = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else
                right = mid - 1;
        }

        System.out.println(ans);

        sc.close();
    }
}