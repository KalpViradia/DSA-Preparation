import java.util.*;

public class question90 {

    static class Edge {
        int u, v, w;
        Edge(int u, int v, int w) { this.u = u; this.v = v; this.w = w; }
    }

    static int find(int[] parent, int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent, parent[x]);
    }

    static void union(int[] parent, int[] rank, int a, int b) {
        a = find(parent, a);
        b = find(parent, b);

        if (rank[a] < rank[b]) parent[a] = b;
        else if (rank[b] < rank[a]) parent[b] = a;
        else {
            parent[b] = a;
            rank[a]++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vertices: ");
        int n = sc.nextInt();

        System.out.print("Enter edges: ");
        int e = sc.nextInt();

        ArrayList<Edge> edges = new ArrayList<>();
        System.out.println("Enter edges (u v w):");
        for (int i = 0; i < e; i++)
            edges.add(new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt()));

        Collections.sort(edges, (a,b)->a.w-b.w);

        int[] parent = new int[n];
        int[] rank = new int[n];

        for (int i = 0; i < n; i++) parent[i] = i;

        int mst = 0;

        for (Edge ed : edges) {
            int pu = find(parent, ed.u);
            int pv = find(parent, ed.v);

            if (pu != pv) {
                mst += ed.w;
                union(parent, rank, pu, pv);
            }
        }

        System.out.println("Total weight of MST = " + mst);

        sc.close();
    }
}
