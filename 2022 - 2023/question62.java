import java.util.*;

public class question62 {

    public static String nextString(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;

        if (i < 0) return "No higher string exists";

        int j = n - 1;
        while (arr[j] <= arr[i]) j--;

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        Arrays.sort(arr, i + 1, n);

        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.next();

        System.out.println("Next String: " + nextString(s));

        sc.close();
    }
}
