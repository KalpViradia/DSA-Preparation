import java.util.*;

public class Question36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long num = sc.nextLong();

        boolean isNegative = num < 0;
        num = Math.abs(num);

        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);

        if(!isNegative) {
            if(digits[0] == '0') {
                for(int i = 1; i < digits.length; i++) {
                    if(digits[i] != '0') {
                        char temp = digits[0];
                        digits[0] = digits[i];
                        digits[i] = temp;
                        break;
                    }
                }
            }
            System.out.println("Minimum number: " + new String(digits));
        } else {
            StringBuilder sb = new StringBuilder(new String(digits));
            System.out.println("Minimum number: -" + sb.reverse());
        }

        sc.close();
    }
}