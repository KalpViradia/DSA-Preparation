import java.util.Scanner;

public class question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                
                if (i == 1 && j > n/2 + 1) {
                    System.out.print("* ");
                } else if (i == n && j <= n/2 + 1) {
                    System.out.print("* ");
                } else if (i == n/2 + 1) {
                    System.out.print("* ");
                } else if (j == n/2 + 1) {
                    System.out.print("* ");
                } else if (j == 1 && i < n/2 + 1) {
                    System.out.print("* ");
                } else if (j == n && i > n/2 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
