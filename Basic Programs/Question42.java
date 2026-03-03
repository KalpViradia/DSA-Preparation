import java.util.*;

public class Question42 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Enter first sorted array:");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter second sorted array:");
        for(int i = 0; i < n; i++)
            b[i] = sc.nextInt();

        int[] merged = new int[2*n];

        int i = 0, j = 0, k = 0;

        while(i < n && j < n) {
            if(a[i] < b[j])
                merged[k++] = a[i++];
            else
                merged[k++] = b[j++];
        }

        while(i < n)
            merged[k++] = a[i++];

        while(j < n)
            merged[k++] = b[j++];

        double median;

        if((2*n) % 2 == 0)
            median = (merged[n-1] + merged[n]) / 2.0;
        else
            median = merged[n];

        System.out.println("Median: " + median);

        sc.close();
    }
}