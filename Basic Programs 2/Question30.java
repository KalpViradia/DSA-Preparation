import java.util.*;

public class Question30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();

        if (n <= 2) {
            System.out.println(n);
            sc.close();
            return;
        }

        int a = 1, b = 2;

        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println(b);

        sc.close();
    }
}