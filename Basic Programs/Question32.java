import java.util.Scanner;

public class Question32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to delete: ");
        int value = sc.nextInt();

        int index = -1;

        for(int i = 0; i < n; i++) {
            if(arr[i] == value) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            System.out.println("Element is not found");
        } else {

            for(int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            System.out.println("Updated Array:");
            for(int i = 0; i < n - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}