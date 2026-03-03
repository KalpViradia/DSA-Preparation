import java.util.*;

public class Question29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of machines: ");
        int n = sc.nextInt();
        int[] machines = new int[n];

        int sum = 0;

        System.out.println("Enter dresses in each machine:");
        for (int i = 0; i < n; i++) {
            machines[i] = sc.nextInt();
            sum += machines[i];
        }

        if (sum % n != 0) {
            System.out.println(-1);
            sc.close();
            return;
        }

        int target = sum / n;
        int moves = 0, balance = 0;

        for (int m : machines) {
            balance += m - target;
            moves = Math.max(moves, Math.max(Math.abs(balance), m - target));
        }

        System.out.println(moves);

        sc.close();
    }
}