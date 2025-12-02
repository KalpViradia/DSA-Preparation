import java.util.*;

public class question95 {

    static void dfs(int node, ArrayList<ArrayList<Integer>> g, boolean[] vis) {
        vis[node] = true;
        for (int nbr : g.get(node))
            if (!vis[nbr])
                dfs(nbr, g, vis);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vertices: ");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());

        System.out.print("Enter edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }

        boolean[] vis = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++)
            if (!vis[i]) {
                dfs(i, g, vis);
                count++;
            }

        System.out.println("Connected Components = " + count);

        sc.close();
    }
}
