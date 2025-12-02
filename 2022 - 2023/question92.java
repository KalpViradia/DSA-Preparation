import java.util.*;

public class question92 {

    static final int INF = 99999;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vertices: ");
        int n = sc.nextInt();

        int[][] dist = new int[n][n];

        System.out.println("Enter adjacency matrix (use 99999 for INF):");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                dist[i][j] = sc.nextInt();

        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];

        System.out.println("All-Pairs Shortest Path:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(dist[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
