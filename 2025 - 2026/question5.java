import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPronic = false;

        for (int k = 0; k * (k + 1) <= n; k++) {
            if (k * (k + 1) == n) {
                isPronic = true;
                break;
            }
        }

        if (isPronic)
            System.out.println(n + " is a Pronic Number.");
        else
            System.out.println(n + " is not a Pronic Number.");

        sc.close();
    }
}
