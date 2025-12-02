import java.util.*;

public class question94 {

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
        Queue<Integer> q = new LinkedList<>();

        vis[start] = true;
        q.add(start);

        System.out.print("BFS: ");

        while (!q.isEmpty()) {
            int cur = q.poll();
            System.out.print(cur + " ");

            for (int i = 0; i < n; i++) {
                if (mat[cur][i] == 1 && !vis[i]) {
                    vis[i] = true;
                    q.add(i);
                }
            }
        }

        sc.close();
    }
}
