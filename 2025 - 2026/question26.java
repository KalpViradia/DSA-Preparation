import java.util.*;

public class question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        if (set.size() < 2) {
            System.out.println("Not enough distinct elements to find second largest and second smallest.");
            sc.close();
            return;
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        int secondSmallest = list.get(1);
        int secondLargest = list.get(list.size() - 2);

        int difference = secondLargest - secondSmallest;

        System.out.println("Difference: " + difference);

        sc.close();
    }
}
