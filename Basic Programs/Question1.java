import java.util.Scanner;

public class Question1 {

    static long factorialIterative(int n) {
        long fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static long factorialRecursive(int n) {
        if(n == 0 || n == 1)
            return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Iterative Factorial: " + factorialIterative(n));
        System.out.println("Recursive Factorial: " + factorialRecursive(n));

        sc.close();
    }
}