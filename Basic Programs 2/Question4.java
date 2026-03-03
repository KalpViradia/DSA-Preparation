import java.util.*;

public class Question4 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node addTwoNumbers(Node l1, Node l2) {

        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;

            current.next = new Node(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first list: ");
        int n1 = sc.nextInt();
        Node l1 = null, tail1 = null;

        System.out.println("Enter " + n1 + " values for first list:");
        for (int i = 0; i < n1; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (l1 == null) {
                l1 = tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }

        System.out.print("Enter size of second list: ");
        int n2 = sc.nextInt();
        Node l2 = null, tail2 = null;

        System.out.println("Enter " + n2 + " values for second list:");
        for (int i = 0; i < n2; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (l2 == null) {
                l2 = tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }

        Node result = addTwoNumbers(l1, l2);

        display(result);

        sc.close();
    }
}