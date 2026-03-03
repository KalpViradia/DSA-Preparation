import java.util.*;

public class Question24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int count = 0;
        int result = -1;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count++;
                if (count == k) {
                    result = i;
                    break;
                }
            }
        }

        System.out.println("k-th factor: " + result);

        sc.close();
    }
}