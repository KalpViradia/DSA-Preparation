import java.util.Scanner;

public class Question18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter octal number: ");
        String octal = sc.next();

        int decimal = Integer.parseInt(octal, 8);
        String hex = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Hexadecimal: " + hex);

        sc.close();
    }
}