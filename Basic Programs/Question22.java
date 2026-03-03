import java.util.Scanner;

public class Question22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int xor = a ^ b;
        int count = 0;

        while(xor != 0) {
            count += xor & 1;
            xor >>= 1;
        }

        System.out.println("Distance (Bit difference): " + count);

        sc.close();
    }
}