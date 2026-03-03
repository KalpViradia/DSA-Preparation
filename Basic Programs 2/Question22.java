import java.util.*;

public class Question22 {

    static class Edge {
        int u, v, weight;

        Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.weight = w;
        }
    }

    static int find(int[] parent, int i) {
        if (parent[i] == i) return i;
        return parent[i] = find(parent, parent[i]);
    }

    static void union(int[] parent, int[] rank, int x, int y) {

        int rootX = find(parent, x);
        int rootY = find(parent, y);

        if (rank[rootX] < rank[rootY])
            parent[rootX] = rootY;
        else if (rank[rootX] > rank[rootY])
            parent[rootY] = rootX;
        else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        List<Edge> edges = new ArrayList<>();

        System.out.println("Enter " + e + " edges (u v weight):");
        for (int i = 0; i < e; i++)
            edges.add(new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt()));

        edges.sort(Comparator.comparingInt(a -> a.weight));

        int[] parent = new int[v];
        int[] rank = new int[v];

        for (int i = 0; i < v; i++)
            parent[i] = i;

        int totalWeight = 0;

        for (Edge edge : edges) {

            int rootU = find(parent, edge.u);
            int rootV = find(parent, edge.v);

            if (rootU != rootV) {

                totalWeight += edge.weight;
                union(parent, rank, rootU, rootV);
            }
        }

        System.out.println("MST Weight: " + totalWeight);

        sc.close();
    }
}