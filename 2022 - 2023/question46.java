import java.util.*;

public class question46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Decimal to Octal");
        System.out.println("2. Octal to Decimal");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Decimal Number: ");
            int decimal = sc.nextInt();
            String oct = Integer.toOctalString(decimal);
            System.out.println("Octal = " + oct);
        } else if (choice == 2) {
            System.out.print("Enter Octal Number: ");
            String oct = sc.next();
            int decimal = Integer.parseInt(oct, 8);
            System.out.println("Decimal = " + decimal);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
