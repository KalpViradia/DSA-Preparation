import java.util.Scanner;

public class Question34 {
    // Question not given
    // Custom question
    // Find Second Largest Element in Array (Without Sorting)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if(n < 2) {
            System.out.println("Array must have at least 2 elements");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {

            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE)
            System.out.println("Second largest element not found (all elements may be equal)");
        else
            System.out.println("Second Largest Element: " + secondLargest);

        sc.close();
    }
}
