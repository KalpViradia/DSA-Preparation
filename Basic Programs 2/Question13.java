import java.util.*;

public class Question13 {

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

    static Node delete(Node root, int key) {

        if (root == null) return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {

            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            Node minNode = root.right;
            while (minNode.left != null)
                minNode = minNode.left;

            root.data = minNode.data;
            root.right = delete(root.right, minNode.data);
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

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node root = null;

        System.out.println("Enter " + n + " BST values:");
        for (int i = 0; i < n; i++)
            root = insert(root, sc.nextInt());

        System.out.print("Enter value to delete: ");
        int deleteValue = sc.nextInt();

        root = delete(root, deleteValue);

        inorder(root);

        sc.close();
    }
}