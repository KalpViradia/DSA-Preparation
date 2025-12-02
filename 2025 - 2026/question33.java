import java.util.Scanner;

public class question33 {
    static double convertBinaryToDecimal(String binary) {
        String[] parts = binary.split("\\."); // split at '.'

        // Convert integer part
        String intPart = parts[0];
        double result = 0;
        int power = 0;
        for (int i = intPart.length() - 1; i >= 0; i--) {
            char c = intPart.charAt(i);
            if (c == '1') {
                result += Math.pow(2, power);
            }
            power++;
        }

        // Convert fractional part if it exists
        if (parts.length > 1) {
            String fracPart = parts[1];
            double fracValue = 0;
            for (int i = 0; i < fracPart.length(); i++) {
                if (fracPart.charAt(i) == '1') {
                    fracValue += 1 / Math.pow(2, i + 1);
                }
            }
            result += fracValue;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary string (with optional fractional part): ");
        String binary = sc.nextLine();

        double decimal = convertBinaryToDecimal(binary);
        System.out.println("Decimal value: " + decimal);

        sc.close();
    }
}
