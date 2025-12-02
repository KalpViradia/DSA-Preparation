import java.util.Scanner;

public class question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        int num = decimal;
        String binary = "";

        // If number is 0
        if (num == 0) {
            binary = "0";
        } else {
            // Convert using repeated division by 2
            while (num > 0) {
                int rem = num % 2;      // remainder (0 or 1)
                binary = rem + binary;  // build binary string
                num = num / 2;          // reduce number
            }
        }

        System.out.println("Binary value = " + binary);

        sc.close();
    }
}
