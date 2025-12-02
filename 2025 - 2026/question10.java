import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[100];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter position to insert (1 to " + (n + 1) + "): ");
        int pos = sc.nextInt();

        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid position!");
        } else {
            for (int i = n; i >= pos; i--) {
                arr[i] = arr[i - 1];
            }

            arr[pos - 1] = element;
            n++;

            System.out.println("Array after insertion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
