import java.util.*;

public class question69 {

    public static int findDigit(int n) {
        long count = 9, digits = 1, start = 1;

        while (n > count * digits) {
            n -= count * digits;
            digits++;
            count *= 10;
            start *= 10;
        }

        long num = start + (n - 1) / digits;

        int index = (n - 1) % (int)digits;
        return Long.toString(num).charAt(index) - '0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Digit = " + findDigit(n));

        sc.close();
    }
}
