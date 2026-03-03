import java.util.Scanner;

public class Question31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to insert (0 to " + n + "): ");
        int pos = sc.nextInt();

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

        for(int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = value;

        System.out.println("Updated Array:");
        for(int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}