import java.util.Scanner;

public class question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = sc.nextInt();

        System.out.print("Enter exponent (b, non-negative): ");
        int b = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= b; i++) {
            int temp = 0;

            for (int j = 1; j <= a; j++) {
                temp += result;
            }

            result = temp;
        }

        System.out.println(a + " raised to the power " + b + " = " + result);
        sc.close();
    }
}
