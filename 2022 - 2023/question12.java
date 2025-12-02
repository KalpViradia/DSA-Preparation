import java.util.Scanner;

public class question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of values (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of values.");
            sc.close();
            return;
        }

        // Read first number to initialize max, min, sum
        System.out.print("Enter number 1: ");
        int num = sc.nextInt();
        int max = num;
        int min = num;
        double sum = num;

        // Loop through remaining n-1 numbers
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            num = sc.nextInt();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

            sum += num;
        }

        double average = sum / n;

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Average value: " + average);

        sc.close();
    }
}
