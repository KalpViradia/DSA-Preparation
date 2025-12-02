import java.util.Scanner;

public class question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Increasing odd numbers
            for (int j = 1; j <= i; j++) {
                System.out.print((2 * j - 1));
                if (j != i) System.out.print(" * ");
            }

            // Decreasing odd numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" * " + (2 * j - 1));
            }

            System.out.println();
        }
        
        sc.close();
    }
}
