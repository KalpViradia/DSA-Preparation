import java.util.*;

public class question96 {

    static boolean dfs(int node, int parent, ArrayList<ArrayList<Integer>> g, boolean[] vis) {
        vis[node] = true;

        for (int nbr : g.get(node)) {
            if (!vis[nbr]) {
                if (dfs(nbr, node, g, vis)) return true;
            } 
            else if (nbr != parent) {
                return true;
            }
        }
        return false;
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

        boolean cycle = false;
        for (int i = 0; i < n; i++)
            if (!vis[i])
                if (dfs(i, -1, g, vis)) cycle = true;

        System.out.println(cycle ? "Cycle Exists" : "No Cycle");

        sc.close();
    }
}
