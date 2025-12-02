import java.util.*;

public class question73 {

    public static long countWays(String s) {
        long count0 = 0, count1 = 0;
        long ways01 = 0, ways10 = 0;
        long ans = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                ans += ways10;
                ways01 += count1;
                count0++;
            } else {
                ans += ways01;
                ways10 += count0;
                count1++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary string: ");
        String s = sc.next();

        System.out.println("Ways = " + countWays(s));

        sc.close();
    }
}
