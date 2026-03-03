import java.util.Scanner;

public class Question20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Decimal to Octal");
        System.out.println("2. Octal to Decimal");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        if(choice == 1) {
            System.out.print("Enter decimal: ");
            int decimal = sc.nextInt();
            System.out.println("Octal: " + Integer.toOctalString(decimal));
        } 
        else if(choice == 2) {
            System.out.print("Enter octal: ");
            String octal = sc.next();
            int decimal = Integer.parseInt(octal, 8);
            System.out.println("Decimal: " + decimal);
        } 
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}