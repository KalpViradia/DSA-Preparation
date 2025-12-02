import java.util.Scanner;

public class question30 {
    static int isInArray(int a[], int m) {
        return isInArrayHelper(a, m, 0);
    }

    static int isInArrayHelper(int a[], int m, int index) {
        if (index == a.length) {
            return 0;
        }
        if (a[index] == m) {
            return 1;
        }
        return isInArrayHelper(a, m, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int m = sc.nextInt();

        int result = isInArray(arr, m);
        if (result == 1) {
            System.out.println(m + " is present in the array.");
        } else {
            System.out.println(m + " is not present in the array.");
        }

        sc.close();
    }
}
