import java.util.Scanner;

public class question15 {
    // Function to convert a single digit to BCD
    static String toBCD(int digit) {
        String bcd = Integer.toBinaryString(digit); // Convert digit to binary
        while (bcd.length() < 4) {                 // Make it 4-bit
            bcd = "0" + bcd;
        }
        return bcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String decimalStr = String.valueOf(decimal);
        StringBuilder bcdResult = new StringBuilder();

        for (int i = 0; i < decimalStr.length(); i++) {
            int digit = Character.getNumericValue(decimalStr.charAt(i));
            bcdResult.append(toBCD(digit)).append(" ");  // Append BCD of each digit
        }

        System.out.println("BCD representation: " + bcdResult.toString());

        sc.close();
    }
}
