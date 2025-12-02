import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num = i;
            int diff = n - 1;
            System.out.print(num + " ");
            for (int j = 1; j < i; j++) {
                num += diff;
                diff--;
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
