import java.util.*;

public class Question21 {

    static class Pair {
        int node, dist;

        Pair(int n, int d) {
            node = n;
            dist = d;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<>());

        System.out.println("Enter " + e + " edges (u v weight):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int w = sc.nextInt();
            int weight = sc.nextInt();

            adj.get(u).add(new Pair(w, weight));
        }

        System.out.print("Enter source vertex: ");
        int src = sc.nextInt();

        int[] dist = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {

            Pair current = pq.poll();

            for (Pair neighbor : adj.get(current.node)) {

                if (dist[current.node] + neighbor.dist < dist[neighbor.node]) {

                    dist[neighbor.node] = dist[current.node] + neighbor.dist;
                    pq.add(new Pair(neighbor.node, dist[neighbor.node]));
                }
            }
        }

        for (int i = 0; i < v; i++)
            System.out.println("Distance to " + i + " : " + dist[i]);

        sc.close();
    }
}