import java.util.*;

public class question47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Decimal to Hexadecimal");
        System.out.println("2. Hexadecimal to Decimal");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Decimal Number: ");
            int decimal = sc.nextInt();
            String hex = Integer.toHexString(decimal).toUpperCase();
            System.out.println("Hexadecimal = " + hex);

        } else if (choice == 2) {
            System.out.print("Enter Hexadecimal Number: ");
            String hex = sc.next();
            int decimal = Integer.parseInt(hex, 16);
            System.out.println("Decimal = " + decimal);

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
