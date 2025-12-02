import java.util.*;

public class question97 {

    static boolean dfs(int node, boolean[] vis, boolean[] stack, ArrayList<ArrayList<Integer>> g) {
        vis[node] = true;
        stack[node] = true;

        for (int nbr : g.get(node)) {
            if (!vis[nbr] && dfs(nbr, vis, stack, g))
                return true;
            else if (stack[nbr])
                return true;
        }

        stack[node] = false;
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

        System.out.println("Enter edges (u v) directed:");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.get(u).add(v);
        }

        boolean[] vis = new boolean[n];
        boolean[] stack = new boolean[n];

        boolean cycle = false;

        for (int i = 0; i < n; i++)
            if (!vis[i])
                if (dfs(i, vis, stack, g)) cycle = true;

        System.out.println(cycle ? "Cycle Exists" : "No Cycle");

        sc.close();
    }
}
