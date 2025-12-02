import java.util.*;

public class question81 {

    static class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void enqueue(int x) {
            s1.push(x);
        }

        int dequeue() {
            if (s1.isEmpty() && s2.isEmpty()) return -1;

            if (s2.isEmpty())
                while (!s1.isEmpty()) s2.push(s1.pop());

            return s2.pop();
        }

        int front() {
            if (s1.isEmpty() && s2.isEmpty()) return -1;

            if (s2.isEmpty())
                while (!s1.isEmpty()) s2.push(s1.pop());

            return s2.peek();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyQueue q = new MyQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); 
        System.out.println(q.front());

        sc.close();
    }
}
