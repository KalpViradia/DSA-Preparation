import java.util.*;

public class question59 {

    static class Node {
        int data;
        Node next, prev;
        Node(int d) { data = d; }
    }

    static Node insert(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    static void print(Node head) {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) head = insert(head, sc.nextInt());

        Node odd = null, even = null;

        Node t = head;
        while (t != null) {
            if (t.data % 2 == 0) even = insert(even, t.data);
            else odd = insert(odd, t.data);
            t = t.next;
        }

        System.out.println("Odd List:");
        print(odd);

        System.out.println("Even List:");
        print(even);

        sc.close();
    }
}
