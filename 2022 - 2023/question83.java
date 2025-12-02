import java.util.*;

public class question83 {

    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    static void inorder(Node r) {
        if (r == null) return;
        inorder(r.left);
        System.out.print(r.data + " ");
        inorder(r.right);
    }

    static void preorder(Node r) {
        if (r == null) return;
        System.out.print(r.data + " ");
        preorder(r.left);
        preorder(r.right);
    }

    static void postorder(Node r) {
        if (r == null) return;
        postorder(r.left);
        postorder(r.right);
        System.out.print(r.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = null;
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) root = insert(root, sc.nextInt());

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);

        sc.close();
    }
}
