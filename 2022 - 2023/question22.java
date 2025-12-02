import java.util.Scanner;

public class question22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------------- PATTERN 1 ----------------
        System.out.print("Enter number of rows for Pattern 1: ");
        int n1 = sc.nextInt();

        int num = 1;
        char ch = 'A';

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print(num++ + " ");
                } else {
                    System.out.print(ch++ + " ");
                }
            }
            System.out.println();
        }

        // ---------------- PATTERN 2 ----------------
        System.out.print("\nEnter number of stars for Pattern 2: ");
        int n2 = sc.nextInt();

        for (int i = n2; i >= 1; i -= 2) {

            // leading spaces
            int spaces = (n2 - i) / 2;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // ---------------- PATTERN 3 ----------------
        System.out.print("\nEnter number of rows for Pattern 3: ");
        int n3 = sc.nextInt();

        for (int i = n3; i >= 1; i--) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= (n3 - i) * 2; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
