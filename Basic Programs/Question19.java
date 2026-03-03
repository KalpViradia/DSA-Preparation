import java.util.Scanner;

public class Question19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hexadecimal number: ");
        String hex = sc.next();

        int decimal = Integer.parseInt(hex, 16);
        String octal = Integer.toOctalString(decimal);

        System.out.println("Octal: " + octal);

        sc.close();
    }
}