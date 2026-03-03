import java.util.*;

public class Question3 {

    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    static void demerge(Node head) {

        Node oddHead = null, oddTail = null;
        Node evenHead = null, evenTail = null;

        Node current = head;

        while (current != null) {

            Node newNode = new Node(current.data);

            if (current.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = evenTail = newNode;
                } else {
                    evenTail.next = newNode;
                    newNode.prev = evenTail;
                    evenTail = newNode;
                }
            } else {
                if (oddHead == null) {
                    oddHead = oddTail = newNode;
                } else {
                    oddTail.next = newNode;
                    newNode.prev = oddTail;
                    oddTail = newNode;
                }
            }

            current = current.next;
        }

        System.out.println("Odd List:");
        printList(oddHead);

        System.out.println("Even List:");
        printList(evenHead);
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node head = null, tail = null;

        System.out.println("Enter " + n + " node values:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        demerge(head);

        sc.close();
    }
}