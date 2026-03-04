import java.util.*;

public class Question1 {

    public static List<Integer> findDominantNumbers(int[] arr) {

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int uniqueCount = freq.size();
        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > uniqueCount) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        List<Integer> dominantNumbers = findDominantNumbers(arr);

        if (dominantNumbers.isEmpty())
            System.out.println("No Dominant Number");
        else
            System.out.println(dominantNumbers);

        sc.close();
    }
}
