import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 10 == (n * n) % 10)
            System.out.println(n + " is a Automorphic number.");
        else
            System.out.println(n + " is not a Automorphic number.");

        sc.close();
    }
}
