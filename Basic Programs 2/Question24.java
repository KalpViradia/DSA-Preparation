import java.util.*;

public class Question24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        int[] edges = new int[n];

        System.out.println("Enter " + n + " edge destinations (-1 for none):");
        for (int i = 0; i < n; i++)
            edges[i] = sc.nextInt();

        boolean[] visited = new boolean[n];
        int maxCycle = -1;

        for (int i = 0; i < n; i++) {

            if (visited[i]) continue;

            Map<Integer, Integer> map = new HashMap<>();
            int node = i;
            int step = 0;

            while (node != -1 && !visited[node]) {

                visited[node] = true;
                map.put(node, step++);
                node = edges[node];

                if (node != -1 && map.containsKey(node)) {
                    maxCycle = Math.max(maxCycle, step - map.get(node));
                    break;
                }
            }
        }

        System.out.println(maxCycle);

        sc.close();
    }
}