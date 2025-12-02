import java.util.*;

public class question40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the arrays: ");
        int n = sc.nextInt();
        int[] arr = new int[2 * n];

        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Enter the elements of second array:");
        for (int i = n; i < 2 * n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        double median = (arr[n] + arr[n + 1]) / 2;

        System.out.println("The median of both array is: " + median);

        sc.close();
    }
}
