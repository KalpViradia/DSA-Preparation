import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose Conversion Type:");
        System.out.println("1. Decimal to Octal");
        System.out.println("2. Octal to Decimal");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a Decimal number: ");
                int decimal = sc.nextInt();
                String octal = Integer.toOctalString(decimal);
                System.out.println("Octal equivalent: " + octal);
                break;

            case 2:
                System.out.print("Enter an Octal number: ");
                String octalNum = sc.next();
                int decimalValue = Integer.parseInt(octalNum, 8);
                System.out.println("Decimal equivalent: " + decimalValue);
                break;

            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        sc.close();
    }
}
