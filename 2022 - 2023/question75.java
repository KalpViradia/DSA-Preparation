import java.util.*;

public class question75 {

    public static int scheduleCourses(int[][] c) {
        Arrays.sort(c, (a, b) -> a[1] - b[1]);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int time = 0;

        for (int[] course : c) {
            time += course[0];
            pq.add(course[0]);

            if (time > course[1]) {
                time -= pq.poll();
            }
        }

        return pq.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of courses: ");
        int n = sc.nextInt();

        int[][] c = new int[n][2];
        System.out.println("Enter duration and lastDay:");
        for (int i = 0; i < n; i++) {
            c[i][0] = sc.nextInt();
            c[i][1] = sc.nextInt();
        }

        System.out.println("Max courses = " + scheduleCourses(c));

        sc.close();
    }
}
