import java.util.*;

public class Question25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();

        int[][] dist = new int[n][n];

        System.out.println("Enter " + n + "x" + n + " distance matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                dist[i][j] = sc.nextInt();

        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(dist[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}