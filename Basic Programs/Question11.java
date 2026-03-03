import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not Ugly Number");
            sc.close();
            return;
        }

        int original = n;

        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        while (n % 5 == 0) {
            n /= 5;
        }

        if (n == 1)
            System.out.println(original + " is Ugly Number");
        else
            System.out.println(original + " is Not Ugly Number");

        sc.close();
    }
}