import java.util.*;

public class Question11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        System.out.print("Enter columns: ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter " + n + "x" + m + " matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = sc.nextInt();

        int[][] rotated = new int[m][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                rotated[j][n - 1 - i] = matrix[i][j];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(rotated[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}