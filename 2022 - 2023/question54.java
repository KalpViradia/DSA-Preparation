import java.util.*;

public class question54 {

    public static int findMoves(int[] machines) {
        int total = 0;
        for (int x : machines) total += x;

        if (total % machines.length != 0) return -1;

        int target = total / machines.length;
        int moves = 0, curr = 0;

        for (int load : machines) {
            int diff = load - target;
            curr += diff;
            moves = Math.max(moves, Math.max(Math.abs(curr), diff));
        }

        return moves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter machine loads:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Minimum moves = " + findMoves(arr));

        sc.close();
    }
}
