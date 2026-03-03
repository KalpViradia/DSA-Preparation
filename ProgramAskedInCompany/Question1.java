import java.util.*;

public class Question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();
        Set<Integer> unique = new HashSet<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            unique.add(num);
        }

        int uniqueCount = unique.size();
        boolean found = false;

        for (int key : freq.keySet()) {
            if (freq.get(key) > uniqueCount) {
                System.out.print(key + " ");
                found = true;
            }
        }

        if (!found)
            System.out.println("No Dominant Number");

        sc.close();
    }
}