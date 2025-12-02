import java.util.Scanner;

public class question35 {
    static boolean canBeNonDecreasing(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
                if (count > 1)
                    return false;

                // Try to fix the violation
                if (i > 0 && arr[i - 1] > arr[i + 1]) {
                    arr[i + 1] = arr[i]; // modify next element
                } else {
                    arr[i] = arr[i + 1]; // modify current element
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = canBeNonDecreasing(arr);
        System.out.println(result);

        sc.close();
    }
}
