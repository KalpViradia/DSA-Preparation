import java.util.Scanner;

public class Question52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int principal = 0, secondary = 0;

        for (int i = 0; i < n; i++) {
            principal += matrix[i][i];
            secondary += matrix[i][n - i - 1];
        }

        System.out.println("Principal Diagonal: " + principal);
        System.out.println("Secondary Diagonal: " + secondary);

        sc.close();
    }
}