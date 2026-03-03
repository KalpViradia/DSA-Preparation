import java.util.*;

public class Question5 {

    static int evaluatePrefix(String exp) {

        Stack<Integer> stack = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {

            char ch = exp.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {

                int op1 = stack.pop();
                int op2 = stack.pop();

                switch (ch) {
                    case '+': stack.push(op1 + op2); break;
                    case '-': stack.push(op1 - op2); break;
                    case '*': stack.push(op1 * op2); break;
                    case '/': stack.push(op1 / op2); break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter prefix expression: ");
        String exp = sc.next();

        System.out.println(evaluatePrefix(exp));

        sc.close();
    }
}