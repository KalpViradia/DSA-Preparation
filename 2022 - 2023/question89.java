import java.util.*;

public class question89 {

    static class Pair {
        int v, w;
        Pair(int v, int w) { this.v = v; this.w = w; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vertices: ");
        int n = sc.nextInt();

        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        System.out.print("Enter edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (u v w):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph.get(u).add(new Pair(v, w));
        }

        System.out.print("Enter source: ");
        int src = sc.nextInt();

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.w-b.w);
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();

            for (Pair p : graph.get(curr.v)) {
                if (dist[curr.v] + p.w < dist[p.v]) {
                    dist[p.v] = dist[curr.v] + p.w;
                    pq.add(new Pair(p.v, dist[p.v]));
                }
            }
        }

        System.out.println("Shortest Distances:");
        for (int i = 0; i < n; i++)
            System.out.println(i + ": " + dist[i]);

        sc.close();
    }
}
