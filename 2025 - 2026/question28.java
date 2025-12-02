import java.util.Scanner;

public class question28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the encoded string: ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();
        int n = input.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                // Build the number (in case of multi-digit numbers like 12a)
                count = count * 10 + (ch - '0');
            } else {
                // If letter comes after number, repeat it 'count' times
                if (count > 0) {
                    for (int j = 0; j < count; j++) {
                        result.append(ch);
                    }
                    count = 0; // reset after using
                } else {
                    // If no number before, just append once
                    result.append(ch);
                }
            }
        }

        System.out.println("Decoded string: " + result.toString());
        
        sc.close();
    }
}
