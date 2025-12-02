import java.util.*;

public class question79 {

    static int prec(char c) {
        switch (c) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
        }
        return -1;
    }

    static String infixToPostfix(String exp) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c : exp.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
            else if (c == '(') st.push(c);
            else if (c == ')') {
                while (st.peek() != '(') sb.append(st.pop());
                st.pop();
            }
            else {
                while (!st.isEmpty() && prec(st.peek()) >= prec(c)) {
                    sb.append(st.pop());
                }
                st.push(c);
            }
        }

        while (!st.isEmpty()) sb.append(st.pop());
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter infix expression: ");
        String exp = sc.next();

        System.out.println("Postfix = " + infixToPostfix(exp));

        sc.close();
    }
}
