import java.util.*;

public class question19 {

    public static void bucketSort(int[] arr) {

        if (arr.length == 0) return;

        int max = arr[0];
        for (int n : arr) {
            if (n > max) max = n;
        }

        int bucketCount = (int) Math.sqrt(arr.length);

        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>()); 
        }

        for (int num : arr) {
            int index = (num * bucketCount) / (max + 1);
            buckets.get(index).add(num);
        }

        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        int k = 0;
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                arr[k++] = num;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bucketSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        sc.close();
    }
}
