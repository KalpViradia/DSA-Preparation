import java.util.*;

public class question67 {

    public static int precedence(char c) {
        switch (c) {
            case '+': return 1;
            case '-': return 1;
            case '*': return 2;
            case '/': return 2;
        }
        return -1;
    }

    public static int apply(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        return 0;
    }

    public static int evaluate(String exp) {
        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (c == ' ') continue;

            if (Character.isDigit(c)) {
                int num = 0;
                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    num = num * 10 + (exp.charAt(i) - '0');
                    i++;
                }
                i--;
                values.push(num);
            }
            else if (c == '(') ops.push(c);
            else if (c == ')') {
                while (ops.peek() != '(') {
                    int b = values.pop();
                    int a = values.pop();
                    values.push(apply(a, b, ops.pop()));
                }
                ops.pop();
            }
            else {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c)) {
                    int b = values.pop();
                    int a = values.pop();
                    values.push(apply(a, b, ops.pop()));
                }
                ops.push(c);
            }
        }

        while (!ops.isEmpty()) {
            int b = values.pop();
            int a = values.pop();
            values.push(apply(a, b, ops.pop()));
        }

        return values.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        sc.nextLine(); // flush
        String exp = sc.nextLine();

        System.out.println("Value = " + evaluate(exp));

        sc.close();
    }
}
