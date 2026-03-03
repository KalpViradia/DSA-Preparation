import java.util.Scanner;

public class Question41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd number for rows and columns: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
        } else {
            int mid = n / 2;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (i == mid || j == mid ||
                        (i == 0 && j > mid) ||
                        (i == n - 1 && j < mid) ||
                        (j == 0 && i < mid) ||
                        (j == n - 1 && i > mid)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}