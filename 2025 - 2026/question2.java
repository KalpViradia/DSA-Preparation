import java.util.Scanner;

public class question2 {
    static boolean isUgly(int n) {
        if (n <= 0)
            return false;

        int[] factors = {2, 3, 5};
        
        for (int f : factors) {
            while (n % f == 0)
                n /= f;
        }
        return n == 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isUgly(n))
            System.out.println(n + " is an ugly number.");
        else
            System.out.println(n + " is not an ugly number.");

        sc.close();
    }
}
