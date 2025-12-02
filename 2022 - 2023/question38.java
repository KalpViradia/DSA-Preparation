import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class question38 {

    Node head;

    // Insert a new element into already sorted list
    public void insertSorted(int data) {
        Node newNode = new Node(data);

        // Case 1: Insert at beginning or when list is empty
        if (head == null || data <= head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 2: Insert in the middle or end
        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        question38 list = new question38();

        System.out.print("Enter number of nodes in sorted list: ");
        int n = sc.nextInt();

        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            list.insertSorted(sc.nextInt());
        }

        System.out.print("Enter new element to insert: ");
        int newValue = sc.nextInt();

        list.insertSorted(newValue);

        System.out.println("List after insertion:");
        list.printList();

        sc.close();
    }
}
