import java.util.*;

public class Question39 {

    static int digitSum(int num) {
        int sum = 0;
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        int max = -1;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(digitSum(arr[i]) == digitSum(arr[j])) {
                    max = Math.max(max, arr[i] + arr[j]);
                }
            }
        }

        System.out.println("Maximum Pair Sum: " + max);

        sc.close();
    }
}