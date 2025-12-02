import java.util.Scanner;

public class question38 {
    public static int checkArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return 0;
            }
        }

        int count = 1;
        boolean hasThreeOrMore = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                if (count >= 3) {
                    hasThreeOrMore = true;
                }
            } else {
                count = 1;
            }
        }

        return hasThreeOrMore ? 1 : 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int  n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array:");
        for (int  i = 0; i < n; i++) arr[i] = sc.nextInt();

        int result = checkArray(arr);
        System.out.println("Output: " + result);

        sc.close();
    }
}
