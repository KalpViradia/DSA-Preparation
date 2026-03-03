import java.util.*;

public class Question2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n < 4) {
            System.out.println("Array must contain at least 4 elements");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }

            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Second Maximum = " + secondMax);
        System.out.println("Minimum = " + min);
        System.out.println("Second Minimum = " + secondMin);

        sc.close();
    }
}