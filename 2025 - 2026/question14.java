import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            // descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            // descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
