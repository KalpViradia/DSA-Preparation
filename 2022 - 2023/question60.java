import java.util.*;

public class question60 {

    static class Job {
        int id, profit, deadline;
        Job(int i, int d, int p) {
            id = i; deadline = d; profit = p;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of jobs: ");
        int n = sc.nextInt();

        Job[] jobs = new Job[n];

        System.out.println("Enter job (id deadline profit):");
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int d = sc.nextInt();
            int p = sc.nextInt();
            jobs[i] = new Job(id, d, p);
        }

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Job j : jobs) maxDeadline = Math.max(maxDeadline, j.deadline);

        int[] slot = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);

        int totalProfit = 0;

        for (Job j : jobs) {
            for (int t = j.deadline; t > 0; t--) {
                if (slot[t] == -1) {
                    slot[t] = j.id;
                    totalProfit += j.profit;
                    break;
                }
            }
        }

        System.out.println("Total Profit = " + totalProfit);

        sc.close();
    }
}
