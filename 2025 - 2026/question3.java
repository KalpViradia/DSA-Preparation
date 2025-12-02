import java.util.Scanner;

public class question3 {
    static boolean isKaprekar(int n) {
        if (n < 1)
            return false;

        long sq = (long) n * n; // square the number
        String str = String.valueOf(sq);
        int len = str.length();

        // Split the square into two parts
        for (int i = 1; i < len; i++) {
            String left = str.substring(0, i);
            String right = str.substring(i);

            int leftNum = (left.isEmpty()) ? 0 : Integer.parseInt(left);
            int rightNum = (right.isEmpty()) ? 0 : Integer.parseInt(right);

            if (leftNum + rightNum == n)
                return true;
        }

        // Check for numbers like 1, 9 (special case)
        return n == 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isKaprekar(n))
            System.out.println(n + " is a Kaprekar number.");
        else
            System.out.println(n + " is not a Kaprekar number.");

        sc.close();
    }
}
