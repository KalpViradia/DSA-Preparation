import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not Armstrong Number");
            sc.close();
            return;
        }

        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        while(n != 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, digits);
            n /= 10;
        }

        if(sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");

        sc.close();
    }
}