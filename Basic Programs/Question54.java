import java.util.Scanner;

public class Question54 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        // Convert to lowercase to make it case-insensitive
        str = str.toLowerCase();

        // Reverse using StringBuilder (efficient way)
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}