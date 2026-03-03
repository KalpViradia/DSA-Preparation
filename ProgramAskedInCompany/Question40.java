import java.util.*;

public class Question40 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();

        int[] a = new int[m];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < m; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();

        int[] b = new int[n];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++)
            b[i] = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int i = 0, j = 0, count = 0;
        int result = -1;

        while (i < m && j < n) {

            if (a[i] < b[j])
                result = a[i++];
            else
                result = b[j++];

            count++;

            if (count == k)
                break;
        }

        while (count < k && i < m) {
            result = a[i++];
            count++;
        }

        while (count < k && j < n) {
            result = b[j++];
            count++;
        }

        System.out.println("k-th element: " + result);

        sc.close();
    }
}