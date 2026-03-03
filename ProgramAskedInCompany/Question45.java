import java.util.Scanner;

public class Question45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int[] fib = new int[n];
        if (n >= 1) fib[0] = 0;
        if (n >= 2) fib[1] = 1;

        for (int i = 2; i < n; i++)
            fib[i] = fib[i - 1] + fib[i - 2];

        System.out.println("Fibonacci series in reverse order:");
        for (int i = n - 1; i >= 0; i--)
            System.out.print(fib[i] + " ");

        sc.close();
    }
}