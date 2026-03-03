import java.util.*;

public class Question23 {

    static class Pair {
        int node, weight;

        Pair(int n, int w) {
            node = n;
            weight = w;
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
            adj.get(w).add(new Pair(u, weight));
        }

        boolean[] visited = new boolean[v];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);

        pq.add(new Pair(0, 0));

        int totalWeight = 0;

        while (!pq.isEmpty()) {

            Pair current = pq.poll();

            if (visited[current.node]) continue;

            visited[current.node] = true;
            totalWeight += current.weight;

            for (Pair neighbor : adj.get(current.node)) {
                if (!visited[neighbor.node])
                    pq.add(new Pair(neighbor.node, neighbor.weight));
            }
        }

        System.out.println("MST Weight: " + totalWeight);

        sc.close();
    }
}