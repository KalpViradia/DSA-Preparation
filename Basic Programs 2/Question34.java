import java.util.*;

public class Question34 {

    static void permute(int[] nums, boolean[] used, List<Integer> current) {

        if (current.size() == nums.length) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) continue;

            used[i] = true;
            current.add(nums[i]);

            permute(nums, used, current);

            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        permute(nums, new boolean[n], new ArrayList<>());

        sc.close();
    }
}