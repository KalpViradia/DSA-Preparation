import java.util.Scanner;

public class Question2 {

    static int sumIterative(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int sumRecursive(int n) {
        if(n == 0)
            return 0;
        return n % 10 + sumRecursive(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Iterative Sum: " + sumIterative(n));
        System.out.println("Recursive Sum: " + sumRecursive(n));

        sc.close();
    }
}