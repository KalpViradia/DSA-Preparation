import java.util.*;

public class question78 {

    static int eval(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = tokens.length - 1; i >= 0; i--) {
            String t = tokens[i];

            if ("+-*/".contains(t)) {
                int a = st.pop();
                int b = st.pop();

                switch (t) {
                    case "+": st.push(a + b); break;
                    case "-": st.push(a - b); break;
                    case "*": st.push(a * b); break;
                    case "/": st.push(a / b); break;
                }
            } else {
                st.push(Integer.parseInt(t));
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter prefix expression: ");
        sc.nextLine();
        String line = sc.nextLine();

        String[] tokens = line.split(" ");

        System.out.println("Value = " + eval(tokens));

        sc.close();
    }
}
