import java.util.Scanner;

public class question44 {

    public static String nextPermutation(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        // Step 1: Find the pivot
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i < 0) return "No next permutation"; // already the largest permutation

        // Step 2: Find the successor
        int j = n - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Step 3: Swap pivot and successor
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // Step 4: Reverse the substring after pivot
        reverse(arr, i + 1, n - 1);

        return new String(arr);
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();

        String next = nextPermutation(s);
        System.out.println("Next lexicographical permutation: " + next);

        sc.close();
    }
}
