import java.util.*;

public class Question39 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] skills = new int[n];

        System.out.println("Enter skill values:");
        for (int i = 0; i < n; i++)
            skills[i] = sc.nextInt();

        Arrays.sort(skills);

        int minHours = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            minHours = Math.min(minHours,
                    skills[i] - skills[i - 1]);
        }

        System.out.println("Minimum Training Hours: " + minHours);

        sc.close();
    }
}