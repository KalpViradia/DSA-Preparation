import java.util.*;

public class Question21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer n: ");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 5; i <= n; i *= 5)
            count += n / i;

        System.out.println("Trailing zeroes in " + n + "! = " + count);

        sc.close();
    }
}