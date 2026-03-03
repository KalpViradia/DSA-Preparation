import java.util.Scanner;

public class Question9 {

    static int multiply(int a, int b) {
        int result = 0;
        for(int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for(int i = 0; i < b; i++) {
            result = multiply(result, a);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int a = sc.nextInt();

        System.out.print("Enter exponent: ");
        int b = sc.nextInt();

        System.out.println("Result: " + power(a, b));

        sc.close();
    }
}