import java.util.*;

public class question53 {

    public static int bitDistance(int a, int b) {
        int xor = a ^ b;
        int count = 0;

        while (xor > 0) {
            count += xor & 1; 
            xor >>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        System.out.println("Bit Distance = " + bitDistance(a, b));

        sc.close();
    }
}
