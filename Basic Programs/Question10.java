import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int bigger = Math.max(a, b);
        int smaller = Math.min(a, b);

        int quotient = 0;
        int remainder = bigger;

        while(remainder >= smaller) {
            remainder -= smaller;
            quotient++;
        }

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        sc.close();
    }
}