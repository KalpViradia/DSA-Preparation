import java.util.*;

public class Question20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (x <= 1) {
            System.out.println("false");
            sc.close();
            return;
        }

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                System.out.println("false");
                sc.close();
                return;
            }
        }

        System.out.println("true");

        sc.close();
    }
}