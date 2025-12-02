import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class question37 {

    Node head;

    // Insert node at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Merge Sort for Linked List
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMiddle(head);
        Node nextToMid = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextToMid);

        return merge(left, right);
    }

    // Merge two sorted linked lists
    public Node merge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        Node result;

        if (left.data <= right.data) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }
        return result;
    }

    // Find middle using slow-fast pointer
    public Node getMiddle(Node head) {
        if (head == null) return head;

        Node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Print linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        question37 list = new question37();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        System.out.println("Original List:");
        list.printList(list.head);

        list.head = list.mergeSort(list.head);

        System.out.println("Sorted List (Ascending):");
        list.printList(list.head);

        sc.close();
    }
}
