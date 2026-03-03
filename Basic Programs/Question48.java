import java.util.Scanner;

public class Question48 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;

        System.out.println("Enter " + n + " array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > max)
                max = arr[i];
        }

        int[] count = new int[max + 1];

        for(int i = 0; i < n; i++)
            count[arr[i]]++;

        System.out.println("Sorted Array:");

        for(int i = 0; i <= max; i++) {
            while(count[i] > 0) {
                System.out.print(i + " ");
                count[i]--;
            }
        }

        sc.close();
    }
}