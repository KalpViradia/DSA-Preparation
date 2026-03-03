import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        n = Math.abs(n);

        while(n != 0) {
            int digit = n % 10;

            if(digit % 2 == 0)
                evenCount++;
            else
                oddCount++;

            n /= 10;
        }

        System.out.println("Total Even Digits: " + evenCount);
        System.out.println("Total Odd Digits: " + oddCount);

        sc.close();
    }
}