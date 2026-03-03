import java.util.Scanner;

public class Question33 {

    static int isInArray(int a[], int m, int index) {
        if(index >= a.length)
            return 0;

        if(a[index] == m)
            return 1;

        return isInArray(a, m, index + 1);
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

        System.out.print("Enter element to search: ");
        int m = sc.nextInt();

        int result = isInArray(arr, m, 0);

        if(result == 1)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");

        sc.close();
    }
}