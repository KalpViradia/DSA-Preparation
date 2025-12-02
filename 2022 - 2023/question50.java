import java.util.*;

public class question50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[] indegree = new int[n];
        int[] outdegree = new int[n];

        System.out.println("Enter directed edges (u v). Enter -1 -1 to stop:");

        while (true) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            if (u == -1 && v == -1) break;

            outdegree[u]++;
            indegree[v]++;
        }

        System.out.println("\nVertex   InDegree   OutDegree");
        for (int i = 0; i < n; i++) {
            System.out.println(i + "          " + indegree[i] + "           " + outdegree[i]);
        }

        sc.close();
    }
}
