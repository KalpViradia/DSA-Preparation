import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total money (n): ");
        int n = sc.nextInt();

        System.out.print("Enter price per chocolate (m): ");
        int m = sc.nextInt();

        System.out.print("Enter wrapper exchange count (k): ");
        int k = sc.nextInt();

        int chocolates = n / m;
        int wrappers = chocolates;

        while(wrappers >= k) {
            int extra = wrappers / k;
            chocolates += extra;
            wrappers = extra + (wrappers % k);
        }

        System.out.println("Total chocolates you can eat: " + chocolates);

        sc.close();
    }
}