import java.util.*;

public class question82 {

    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static Node insert(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.data) root.left = insert(root.left, key);
        else if (key > root.data) root.right = insert(root.right, key);
        return root;
    }

    static Node minNode(Node root) {
        while (root.left != null) root = root.left;
        return root;
    }

    static Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) root.left = delete(root.left, key);
        else if (key > root.data) root.right = delete(root.right, key);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            Node min = minNode(root.right);
            root.data = min.data;
            root.right = delete(root.right, min.data);
        }
        return root;
    }

    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = null;
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter values to insert:");
        for (int i = 0; i < n; i++) root = insert(root, sc.nextInt());

        System.out.print("Enter node to delete: ");
        int key = sc.nextInt();

        root = delete(root, key);

        System.out.println("BST Inorder after deletion:");
        inorder(root);

        sc.close();
    }
}
