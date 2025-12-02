import java.util.*;

public class question77 {

    static boolean isValid(String s) {
        int n = s.length();
        if (n < 3) return false;

        int i = 0, j = n - 1;

        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }

        return i > j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.next();

        if (isValid(s)) System.out.println("Matches wcwR pattern");
        else System.out.println("Does NOT match wcwR pattern");

        sc.close();
    }
}
