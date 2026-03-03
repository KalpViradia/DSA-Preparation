import java.util.*;

public class Question30 {

    static boolean isPrime(int num) {

        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++)
            if (num % i == 0)
                return false;

        return true;
    }

    static boolean containsDigitTwice(int num, int digit) {

        int count = 0;

        while (num > 0) {
            if (num % 10 == digit)
                count++;
            num /= 10;
        }

        return count == 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digit (0-9): ");
        int digit = sc.nextInt();

        for (int i = 99999; i >= 10000; i--) {

            if (isPrime(i) && containsDigitTwice(i, digit)) {
                System.out.println("Result: " + i);
                sc.close();
                return;
            }
        }

        System.out.println("No such number found");

        sc.close();
    }
}