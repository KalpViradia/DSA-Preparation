import java.util.Scanner;

public class question6 {
    // Function to check if a number is happy using cycle detection
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquares(slow);             // move 1 step
            fast = sumOfSquares(sumOfSquares(fast)); // move 2 steps
        } while (slow != fast); // detect cycle

        return slow == 1; // if we reached 1, it's a happy number
    }

    // Helper to compute sum of squares of digits
    private static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isHappy(n))
            System.out.println(n + " is a Happy Number.");
        else
            System.out.println(n + " is not a Happy Number.");

        sc.close();
    }
}
