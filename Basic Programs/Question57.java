import java.util.Scanner;

public class Question57 {

    static boolean isValid(String s) {

        int n = s.length();

        if(n % 2 == 0)
            return false;

        int mid = n / 2;

        if(s.charAt(mid) != 'c')
            return false;

        String w = s.substring(0, mid);
        String wR = s.substring(mid+1);

        String reversed = new StringBuilder(w).reverse().toString();

        if(!w.equals(w.replaceAll("[^ab]", "")))
            return false;

        return reversed.equals(wR);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.next();

        if(isValid(s))
            System.out.println("Valid wcwR pattern");
        else
            System.out.println("Invalid pattern");

        sc.close();
    }
}