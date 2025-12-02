import java.util.*;

public class question63 {

    static void permute(int[] nums, int start) {
        if (start == nums.length) {
            System.out.println(Arrays.toString(nums));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[start];
            nums[start] = temp;

            permute(nums, start + 1);

            temp = nums[i];
            nums[i] = nums[start];
            nums[start] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        permute(nums, 0);

        sc.close();
    }
}
