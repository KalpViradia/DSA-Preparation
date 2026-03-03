import java.util.*;

public class Question2 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node insertSorted(Node head, int value) {
        Node newNode = new Node(value);

        if (head == null || value < head.data) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;

        while (current.next != null && current.next.data < value) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node head = null, tail = null;

        System.out.println("Enter " + n + " node values (sorted):");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

        head = insertSorted(head, value);

        display(head);

        sc.close();
    }
}