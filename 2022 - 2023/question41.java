import java.util.*;

public class question41 {

    public static int smallestNumber(int num) {
        if (num == 0) return 0;

        boolean isNegative = num < 0;
        String numStr = Integer.toString(Math.abs(num));
        char[] digits = numStr.toCharArray();

        if (isNegative) {
            // For negative numbers, sort in descending order
            Arrays.sort(digits);
            // reverse to get descending
            for (int i = 0, j = digits.length - 1; i < j; i++, j--) {
                char temp = digits[i];
                digits[i] = digits[j];
                digits[j] = temp;
            }
        } else {
            // For positive numbers, sort in ascending order
            Arrays.sort(digits);

            // Move first non-zero digit to the front to avoid leading zeros
            if (digits[0] == '0') {
                for (int i = 1; i < digits.length; i++) {
                    if (digits[i] != '0') {
                        char temp = digits[0];
                        digits[0] = digits[i];
                        digits[i] = temp;
                        break;
                    }
                }
            }
        }

        int result = Integer.parseInt(new String(digits));
        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int minNum = smallestNumber(num);

        System.out.println("Minimal rearranged number: " + minNum);

        sc.close();
    }
}
