import java.util.*;

public class Question32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        int total = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            if (leftSum == total - leftSum - arr[i]) {
                System.out.println("Pivot index: " + i);
                sc.close();
                return;
            }

            leftSum += arr[i];
        }

        System.out.println("Pivot index not found");

        sc.close();
    }
}