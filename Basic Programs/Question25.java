import java.util.Scanner;

public class Question25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int stars = 2 * n - 1;

        for(int i = 0; i < n; i++) {

            for(int space = 0; space < i; space++)
                System.out.print(" ");

            for(int j = 0; j < stars; j++)
                System.out.print("*");

            stars -= 2;
            System.out.println();
        }

        sc.close();
    }
}