import java.util.Scanner;

public class Question40 {
    // Question not given
    // Custom question
    // Find the First Non-Repeating Element in an Array

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for(int i = 0; i < n; i++) {

            int count = 0;

            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j])
                    count++;
            }

            if(count == 1) {
                System.out.println("First Non-Repeating Element: " + arr[i]);
                found = true;
                break;
            }
        }

        if(!found)
            System.out.println("No non-repeating element found");

        sc.close();
    }
}
