import java.util.*;

public class Question8 {

    static class MyQueue {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void enqueue(int x) {
            s1.push(x);
        }

        int dequeue() {

            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            if (s2.isEmpty()) return -1;

            return s2.pop();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyQueue queue = new MyQueue();

        System.out.print("Enter number of elements to enqueue: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            queue.enqueue(val);
        }

        System.out.println("Dequeue: " + queue.dequeue());

        sc.close();
    }
}