import java.util.*;

public class Question20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        int[] inDegree = new int[v];
        int[] outDegree = new int[v];

        System.out.println("Enter edges (u v), enter -1 to stop:");
        while (true) {

            int u = sc.nextInt();
            if (u == -1) break;

            int w = sc.nextInt();

            outDegree[u]++;
            inDegree[w]++;
        }

        for (int i = 0; i < v; i++) {
            System.out.println("Vertex " + i + " -> In: " + inDegree[i] + " Out: " + outDegree[i]);
        }

        sc.close();
    }
}