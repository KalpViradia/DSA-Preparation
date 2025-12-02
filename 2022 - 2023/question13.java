import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions of first matrix
        System.out.print("Enter number of rows of first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns of first matrix: ");
        int c1 = sc.nextInt();

        int[][] matrix1 = new int[r1][c1];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input dimensions of second matrix
        System.out.print("Enter number of rows of second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns of second matrix: ");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible! Columns of first matrix must equal rows of second matrix.");
            sc.close();
            return;
        }

        int[][] matrix2 = new int[r2][c2];

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[r1][c2];

        // Matrix multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display result
        System.out.println("Product of the matrices:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
