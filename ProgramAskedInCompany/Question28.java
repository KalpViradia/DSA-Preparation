import java.util.*;

public class Question28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter even size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] result = new int[n];
        int mid = n / 2;
        int j = 0;

        for (int i = 0; i < mid; i++) {
            result[j++] = arr[i];
            result[j++] = arr[i + mid];
        }

        System.out.println("Rearranged Array:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}