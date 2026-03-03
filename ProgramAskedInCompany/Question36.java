import java.util.*;

public class Question36 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLine();

        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[n - 1];

        int i = 0;
        while (i < first.length() &&
               i < last.length() &&
               first.charAt(i) == last.charAt(i)) {
            i++;
        }

        System.out.println("Longest Common Prefix: " +
                first.substring(0, i));

        sc.close();
    }
}