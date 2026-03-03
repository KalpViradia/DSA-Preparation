import java.util.*;

public class Question10 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);

        if (val < root.data)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }

    static void printLeaf(Node root) {
        if (root == null) return;

        if (root.left == null && root.right == null)
            System.out.print(root.data + " ");

        printLeaf(root.left);
        printLeaf(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node root = null;

        System.out.println("Enter " + n + " BST values:");
        for (int i = 0; i < n; i++)
            root = insert(root, sc.nextInt());

        printLeaf(root);

        sc.close();
    }
}