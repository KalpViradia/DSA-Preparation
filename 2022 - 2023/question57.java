import java.util.*;

public class question57 {

    public static int checkArray(int[] arr) {
        // Check ascending
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return 0;
        }

        // Check occurrence >= 3
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count >= 3) return 1;
            } else {
                count = 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(checkArray(arr));

        sc.close();
    }
}
