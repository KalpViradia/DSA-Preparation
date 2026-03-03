import java.util.Scanner;

public class Question59 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine().trim();

        boolean isValid = s.matches(
                "[+-]?((\\d+\\.\\d*)|(\\.\\d+)|(\\d+))([eE][+-]?\\d+)?"
        );

        if (isValid)
            System.out.println("Valid Number");
        else
            System.out.println("Invalid Number");

        sc.close();
    }
}