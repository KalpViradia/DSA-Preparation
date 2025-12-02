import java.util.*;

public class question72 {

    static int digitSum(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;

        for (int x : nums) {
            int d = digitSum(x);

            if (map.containsKey(d)) {
                maxSum = Math.max(maxSum, map.get(d) + x);
                map.put(d, Math.max(map.get(d), x));
            } else {
                map.put(d, x);
            }
        }

        System.out.println("Max Sum = " + maxSum);

        sc.close();
    }
}
