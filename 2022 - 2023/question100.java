import java.util.*;

public class question100 {

    static boolean isBipartite(ArrayList<ArrayList<Integer>> g, int n) {
        int[] color = new int[n];
        Arrays.fill(color, -1);

        Queue<Integer> q = new LinkedList<>();

        for (int start = 0; start < n; start++) {
            if (color[start] == -1) {
                q.add(start);
                color[start] = 0;

                while (!q.isEmpty()) {
                    int node = q.poll();

                    for (int nbr : g.get(node)) {
                        if (color[nbr] == -1) {
                            color[nbr] = 1 - color[node];
                            q.add(nbr);
                        } else if (color[nbr] == color[node]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
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

        System.out.println(isBipartite(g, n) ? "Graph is Bipartite" : "Graph is Not Bipartite");

        sc.close();
    }
}
