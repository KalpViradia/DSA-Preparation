import java.util.Scanner;

public class Question44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount (P): ");
        double P = sc.nextDouble();

        System.out.print("Enter annual interest rate (R): ");
        double R = sc.nextDouble();

        System.out.print("Enter loan tenure in months (N): ");
        int N = sc.nextInt();

        double monthlyRate = R / (12 * 100);
        double EMI = (P * monthlyRate * Math.pow(1 + monthlyRate, N)) /
                     (Math.pow(1 + monthlyRate, N) - 1);

        System.out.printf("The EMI per month is: %.2f", EMI);
        sc.close();
    }
}