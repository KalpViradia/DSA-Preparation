import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check last bit: if n & 1 == 1 → odd, else even
        if ((n & 1) == 0) {
            System.out.println(n + " is Even.");
        } else {
            System.out.println(n + " is Odd.");
        }

        sc.close();
    }
}
