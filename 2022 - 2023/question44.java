import java.util.*;

public class question44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Octal Number: ");
        String oct = sc.next();

        // Convert Octal → Decimal
        int decimal = Integer.parseInt(oct, 8);

        // Convert Decimal → Hexadecimal
        String hex = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Hexadecimal = " + hex);

        sc.close();
    }
}
