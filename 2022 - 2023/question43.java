import java.util.*;

public class question43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int value : arr) {
            int target = k - value;

            if (map.containsKey(target)) {
                count += map.get(target);
            }

            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        System.out.println("Number of pairs = " + count);

        sc.close();
    }
}
