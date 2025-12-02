import java.util.*;

public class question49 {

    static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int nbr : graph.get(node)) {
            if (!visited[nbr]) {
                dfs(nbr, visited, graph);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);   // for undirected graph
            graph.get(v).add(u);
        }

        System.out.print("Enter starting node for DFS: ");
        int start = sc.nextInt();

        boolean[] visited = new boolean[n];
        System.out.print("DFS Traversal: ");
        dfs(start, visited, graph);

        sc.close();
    }
}
