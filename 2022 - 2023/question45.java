import java.util.*;

public class question45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hexadecimal Number: ");
        String hex = sc.next();

        // Convert Hex → Decimal
        int decimal = Integer.parseInt(hex, 16);

        // Convert Decimal → Octal
        String oct = Integer.toOctalString(decimal);

        System.out.println("Octal = " + oct);

        sc.close();
    }
}
