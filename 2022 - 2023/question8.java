import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int oddCount = 0, evenCount = 0;
        int temp = n;

        while (temp != 0) {
            int digit = temp % 10;

            if (digit % 2 == 0)
                evenCount++;
            else
                oddCount++;

            temp /= 10;
        }

        System.out.println("Total even digits: " + evenCount);
        System.out.println("Total odd digits : " + oddCount);

        sc.close();
    }
}
