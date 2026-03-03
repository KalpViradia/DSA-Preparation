import java.util.*;

public class Question7 {

    static class MyStack {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        void push(int x) {
            q2.add(x);

            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        int pop() {
            if (q1.isEmpty()) return -1;
            return q1.remove();
        }

        int top() {
            if (q1.isEmpty()) return -1;
            return q1.peek();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();

        System.out.print("Enter number of elements to push: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            stack.push(val);
        }

        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());

        sc.close();
    }
}