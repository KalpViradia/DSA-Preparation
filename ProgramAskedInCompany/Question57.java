import java.math.BigInteger;
import java.util.Scanner;

public class Question57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first digit (D): ");
        int D = sc.nextInt();

        System.out.print("Enter count (N): ");
        int N = sc.nextInt();

        BigInteger sum = BigInteger.ZERO;

        for (int i = 1; i <= N; i++) {
            String number = D + "0000000000" + i;
            BigInteger bigNum = new BigInteger(number);
            sum = sum.add(bigNum);
        }

        System.out.println("Total sum: " + sum);

        sc.close();
    }
}