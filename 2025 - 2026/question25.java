import java.util.Scanner;

public class question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rupees: ");
        int n = sc.nextInt();

        System.out.print("Enter price of chocolate in rupees: ");
        int m = sc.nextInt();

        System.out.print("Enter number of wrappers for exchange: ");
        int k = sc.nextInt();

        int chocolates = n / m;
        int wrappers = chocolates;

        // while (wrappers >= k) {
        //     wrappers = wrappers - k + 1;
        //     chocolates++;
        // }

        while (wrappers >= k) {
            int extra = wrappers / k;      // extra chocolates from wrappers
            chocolates += extra;           // add to total
            wrappers = wrappers % k + extra; // update remaining wrappers
        }

        System.out.println("The total number of chocolates you can eat with " + n + " rupees is: " + chocolates);

        sc.close();
    }
}
