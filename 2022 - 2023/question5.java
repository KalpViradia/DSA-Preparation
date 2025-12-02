import java.util.Scanner;

public class question5 {
    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        // Iterative

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();

        // int sum = 0;
        // int temp = n;

        // while (temp != 0) {
        //     sum += temp % 10;
        //     temp /= 10;
        // }

        // System.out.println("Sum of digits of " + n + " = " + sum);

        // sc.close();


        // Recursive

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = sumDigits(n);

        System.out.println("Sum of digits of " + n + " = " + result);

        sc.close();
    }
}
