import java.util.Scanner;

public class question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int base = 1;  // 2^0

        while (binary > 0) {
            int lastDigit = binary % 10;   // extract last digit
            decimal += lastDigit * base;   // add (digit * power of 2)
            base *= 2;                     // next power of 2
            binary /= 10;                  // remove last digit
        }

        System.out.println("Decimal value = " + decimal);
        
        sc.close();
    }
}
