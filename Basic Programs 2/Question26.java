import java.util.*;

public class Question26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of courses: ");
        int n = sc.nextInt();
        int[][] courses = new int[n][2];

        System.out.println("Enter " + n + " courses (duration deadline):");
        for (int i = 0; i < n; i++) {
            courses[i][0] = sc.nextInt();
            courses[i][1] = sc.nextInt();
        }

        Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int time = 0;

        for (int[] course : courses) {

            time += course[0];
            pq.add(course[0]);

            if (time > course[1]) {
                time -= pq.poll();
            }
        }

        System.out.println(pq.size());

        sc.close();
    }
}