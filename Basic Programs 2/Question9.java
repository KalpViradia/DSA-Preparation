import java.util.*;

public class Question9 {

    public static int evaluateExpression(String s) {

        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Skip spaces
            if (ch == ' ') continue;

            // If digit, build full number (multi-digit support)
            if (Character.isDigit(ch)) {

                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--; // adjust index after loop
                numbers.push(num);
            }

            // If operator
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                while (!operators.isEmpty() &&
                        precedence(operators.peek()) >= precedence(ch)) {

                    int b = numbers.pop();
                    int a = numbers.pop();
                    char op = operators.pop();

                    numbers.push(applyOperator(a, b, op));
                }

                operators.push(ch);
            }
        }

        // Process remaining operators
        while (!operators.isEmpty()) {
            int b = numbers.pop();
            int a = numbers.pop();
            char op = operators.pop();

            numbers.push(applyOperator(a, b, op));
        }

        return numbers.pop();
    }

    // Operator precedence
    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    // Apply operator
    public static int applyOperator(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b; // assume no divide by zero
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression (e.g. 2+3*4): ");
        String s = sc.nextLine();  // take full expression from user

        System.out.println(evaluateExpression(s));

        sc.close();
    }
}