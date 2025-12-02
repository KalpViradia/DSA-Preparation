import java.util.Scanner;

public class question42 {
    public static int findNthDigit(int n) {
        int length = 1;       // length of numbers
        long count = 9;       // total digits in this length
        long start = 1;       // first number of this length

        // 1️⃣ Find the length of the number that contains nth digit
        while (n > count) {
            n -= count;
            length++;
            start *= 10;
            count = 9L * start * length;
        }

        // 2️⃣ Find the actual number containing the nth digit
        long num = start + (n - 1) / length;

        // 3️⃣ Find the position of the digit in this number
        int digitIndex = (n - 1) % length;
        String numStr = Long.toString(num);

        return numStr.charAt(digitIndex) - '0';
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int result = findNthDigit(n);
        System.out.println("The " + n + "th digit is: " + result);

        sc.close();
    }
}
