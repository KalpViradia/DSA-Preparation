import java.util.*;

public class question66 {

    static int countPairs(int[] arr, int mid) {
        int count = 0;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            while (arr[right] - arr[left] > mid) left++;
            count += right - left;
        }
        return count;
    }

    public static int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);

        int low = 0, high = nums[nums.length - 1] - nums[0];

        while (low < high) {
            int mid = (low + high) / 2;

            if (countPairs(nums, mid) >= k) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("K-th smallest distance = " + smallestDistancePair(nums, k));

        sc.close();
    }
}
