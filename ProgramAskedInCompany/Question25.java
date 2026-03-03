import java.util.*;

public class Question25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        System.out.println("Ascending Order:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Descending Order:");
        for (int i = n - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");

        sc.close();
    }
}