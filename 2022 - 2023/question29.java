import java.util.Scanner;

public class question29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Identify bigger and smaller numbers
        int dividend = Math.max(a, b);
        int divisor = Math.min(a, b);

        int quotient = 0;
        int remainder = dividend;

        // Repeated subtraction to get quotient
        while (remainder >= divisor) {
            remainder -= divisor;
            quotient++;
        }

        // Output
        System.out.println("Dividend = " + dividend);
        System.out.println("Divisor  = " + divisor);
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

        sc.close();
    }
}
