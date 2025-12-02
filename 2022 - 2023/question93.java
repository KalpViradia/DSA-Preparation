import java.util.*;

public class question93 {

    static void dfs(int node, int[][] mat, boolean[] vis) {
        vis[node] = true;
        System.out.print(node + " ");

        for (int i = 0; i < mat.length; i++)
            if (mat[node][i] == 1 && !vis[i])
                dfs(i, mat, vis);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vertices: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter adjacency matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        System.out.print("Enter start node: ");
        int start = sc.nextInt();

        boolean[] vis = new boolean[n];

        System.out.print("DFS: ");
        dfs(start, mat, vis);

        sc.close();
    }
}
