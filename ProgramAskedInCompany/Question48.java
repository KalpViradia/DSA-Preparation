import java.util.Scanner;

public class Question48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean result = false;
        String doubled = str + str;

        if (doubled.substring(1, doubled.length() - 1).contains(str))
            result = true;

        System.out.println("Can be formed by repeating substring? " + result);
        sc.close();
    }
}