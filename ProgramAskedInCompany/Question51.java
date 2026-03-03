import java.util.*;

public class Question51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter the elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2];
        HashSet<Integer> set = new HashSet<>();

        int index = 0;

        for (int num : arr1) {
            merged[index++] = num;
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                merged[index++] = 0;
            } else {
                merged[index++] = num;
                set.add(num);
            }
        }

        System.out.println("Merged array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}