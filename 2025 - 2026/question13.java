import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // First row or last row
                if (i == 0 || i == n - 1) {
                    System.out.print("* ");
                }
                // Diagonals (i == j or i + j == n - 1)
                else if (i == j || i + j == n - 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
