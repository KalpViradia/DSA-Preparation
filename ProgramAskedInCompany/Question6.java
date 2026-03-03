import java.util.*;

public class Question6 {

    static boolean isHarmonious(String s) {

        int[] freq = new int[256];
        for (char c : s.toCharArray())
            freq[c]++;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int f : freq) {
            if (f > 0) {
                min = Math.min(min, f);
                max = Math.max(max, f);
            }
        }

        return (max - min) <= 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {

                String sub = str.substring(i, j);

                if (isHarmonious(sub))
                    System.out.println(sub);
            }
        }

        sc.close();
    }
}