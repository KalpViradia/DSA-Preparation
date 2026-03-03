import java.util.Scanner;

public class Question16 {

    static String toBCD(int n) {
        StringBuilder bcd = new StringBuilder();

        while(n > 0) {
            int digit = n % 10;
            String bin = String.format("%4s", Integer.toBinaryString(digit)).replace(' ', '0');
            bcd.insert(0, bin + " ");
            n /= 10;
        }

        return bcd.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();

        System.out.println("BCD: " + toBCD(n));

        sc.close();
    }
}