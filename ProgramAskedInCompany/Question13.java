import java.util.*;

public class Question13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " jump values:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int maxReach = 0;

        for (int i = 0; i < n; i++) {

            if (i > maxReach) {
                System.out.println("False");
                sc.close();
                return;
            }

            maxReach = Math.max(maxReach, i + nums[i]);
        }

        System.out.println("True");

        sc.close();
    }
}