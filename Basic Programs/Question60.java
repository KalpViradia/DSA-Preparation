import java.util.Scanner;

public class Question60 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pattern: ");
        String input = sc.next();

        StringBuilder result = new StringBuilder();
        int num = 0;

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else {

                // If no number before character, assume 1
                int repeat = (num == 0) ? 1 : num;

                for (int j = 0; j < repeat; j++) {
                    result.append(ch);
                }

                num = 0; // reset number
            }
        }

        System.out.println("Decoded String: " + result);

        sc.close();
    }
}