import java.util.*;

public class question91 {

    static class Pair {
        int v, w;
        Pair(int v, int w) { this.v = v; this.w = w; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (u v w):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            graph.get(u).add(new Pair(v, w));
            graph.get(v).add(new Pair(u, w)); // undirected
        }

        boolean[] visited = new boolean[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.w - b.w);

        pq.add(new Pair(0, 0)); // start from node 0

        int mst = 0;

        while (!pq.isEmpty()) {
            Pair p = pq.poll();

            if (visited[p.v]) continue;
            visited[p.v] = true;
            mst += p.w;

            for (Pair nbr : graph.get(p.v)) {
                if (!visited[nbr.v]) pq.add(nbr);
            }
        }

        System.out.println("Total MST Weight = " + mst);

        sc.close();
    }
}
