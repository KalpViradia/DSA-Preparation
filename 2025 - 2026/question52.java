import java.util.Scanner;

public class question52 {
    public static boolean repeatedSubstringPattern(String str) {
        int n = str.length();

        for (int l = 1; l <= n / 2; l++) {
            if (n % l != 0) continue;

            String sub = str.substring(0, l);
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n / l; i++) sb.append(sub);

            if (sb.toString().equals(str)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        boolean result = repeatedSubstringPattern(str);
        System.out.println("Can be formed by repeating a substring: " + result);

        sc.close();
    }
}
