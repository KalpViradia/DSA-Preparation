import java.util.*;

public class question98 {

    static void dfs(int node, ArrayList<ArrayList<Integer>> g, boolean[] vis, Stack<Integer> st) {
        vis[node] = true;

        for (int nbr : g.get(node))
            if (!vis[nbr])
                dfs(nbr, g, vis, st);

        st.push(node);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vertices: ");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());

        System.out.print("Enter edges: ");
        int e = sc.nextInt();

        System.out.println("Enter directed edges (u v):");
        for (int i = 0; i < e; i++)
            g.get(sc.nextInt()).add(sc.nextInt());

        boolean[] vis = new boolean[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++)
            if (!vis[i]) dfs(i, g, vis, st);

        System.out.println("Topological Order:");
        while (!st.isEmpty()) System.out.print(st.pop() + " ");

        sc.close();
    }
}
