import java.util.*;

public class question58 {

    static int sumSq(int n) {
        int s = 0;
        while (n > 0) {
            int d = n % 10;
            s += d * d;
            n /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        while (true) {
            if (n == 1) {
                System.out.println("Happy number!");
                break;
            }

            if (set.contains(n)) {
                System.out.println("Not a happy number.");
                break;
            }

            set.add(n);
            n = sumSq(n);
        }

        sc.close();
    }
}
