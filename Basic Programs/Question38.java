import java.util.*;

public class Question38 {

    static int checkCondition(int[] arr) {

        // check ascending
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1])
                return 0;
        }

        // count frequency
        for(int i = 0; i < arr.length; i++) {
            int count = 1;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    count++;
            }
            if(count >= 3)
                return 1;
        }

        return 0;
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

        System.out.println("Result: " + checkCondition(arr));

        sc.close();
    }
}