import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose Conversion Type:");
        System.out.println("1. Decimal to Hexadecimal");
        System.out.println("2. Hexadecimal to Decimal");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a Decimal number: ");
                int decimal = sc.nextInt();
                String hex = Integer.toHexString(decimal).toUpperCase();
                System.out.println("Hexadecimal equivalent: " + hex);
                break;

            case 2:
                System.out.print("Enter a Hexadecimal number: ");
                String hexNum = sc.next();
                int decimalValue = Integer.parseInt(hexNum, 16);
                System.out.println("Decimal equivalent: " + decimalValue);
                break;

            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        sc.close();
    }
}
