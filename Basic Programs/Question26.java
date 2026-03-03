import java.util.Scanner;

public class Question26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int total = 2 * n - 1;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < total; j++) {

                if(j < (n - i - 1) || j > (n + i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        sc.close();
    }
}