import java.util.*;

public class question65 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static Node insert(Node head, int val) {
        if (head == null) return new Node(val);
        Node t = head;
        while (t.next != null) t = t.next;
        t.next = new Node(val);
        return head;
    }

    static Node add(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node p = l1, q = l2, curr = dummy;
        int carry = 0;

        while (p != null || q != null) {
            int sum = carry;
            if (p != null) { sum += p.data; p = p.next; }
            if (q != null) { sum += q.data; q = q.next; }

            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
        }

        if (carry > 0) curr.next = new Node(carry);

        return dummy.next;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node l1 = null, l2 = null;

        System.out.print("Enter size of list1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter digits:");
        for (int i = 0; i < n1; i++) l1 = insert(l1, sc.nextInt());

        System.out.print("Enter size of list2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter digits:");
        for (int i = 0; i < n2; i++) l2 = insert(l2, sc.nextInt());

        Node result = add(l1, l2);

        System.out.println("Result:");
        print(result);

        sc.close();
    }
}
