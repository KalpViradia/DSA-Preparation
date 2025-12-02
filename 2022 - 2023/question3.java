import java.util.Scanner;

public class question3 {
    static void printFactors(int n, int i) {
        if (i > n) {
            return;
        }
        if (n % i == 0) {
            System.out.print(i + " ");
        }
        printFactors(n, i + 1);
    }

    public static void main(String[] args) {
        // Iterative

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();

        // System.out.println("Factors of " + n + " are:");

        // for (int i = 1; i <= n; i++) {
        //     if (n % i == 0) {
        //         System.out.print(i + " ");
        //     }
        // }

        // sc.close();


        // Recursive

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factors of " + n + " are:");
        printFactors(n, 1);

        sc.close();
    }
}
