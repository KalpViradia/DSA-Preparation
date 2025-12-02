import java.util.Scanner;

public class question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int num = 1; // start from 1

        for (int i = 1; i <= n; i++) {
            int rowStart = num;
            int rowEnd = num + n - 1;

            // For even rows, print in reverse order
            if (i % 2 == 0) {
                for (int j = rowEnd; j >= rowStart; j--) {
                    System.out.print(j + " ");
                }
            } 
            // For odd rows, print in normal order
            else {
                for (int j = rowStart; j <= rowEnd; j++) {
                    System.out.print(j + " ");
                }
            }

            System.out.println(); // move to next line
            num += n; // update starting number for next row
        }

        sc.close();
    }
}
