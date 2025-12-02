import java.util.*;

public class question80 {

    static class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        void push(int x) {
            q2.add(x);
            while (!q1.isEmpty()) q2.add(q1.poll());
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        int pop() { return q1.poll(); }

        int top() { return q1.peek(); }

        boolean empty() { return q1.isEmpty(); }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyStack st = new MyStack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top = " + st.top());
        System.out.println("Pop = " + st.pop());
        System.out.println("Top = " + st.top());

        sc.close();
    }
}
