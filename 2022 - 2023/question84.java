import java.util.*;

public class question84 {

    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static Node build(Node r, int val) {
        if (r == null) return new Node(val);
        if (val < r.data) r.left = build(r.left, val);
        else r.right = build(r.right, val);
        return r;
    }

    static Node invert(Node root) {
        if (root == null) return null;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        return root;
    }

    static void inorder(Node r) {
        if (r == null) return;
        inorder(r.left);
        System.out.print(r.data + " ");
        inorder(r.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = null;

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++)
            root = build(root, sc.nextInt());

        root = invert(root);

        System.out.println("Tree after inversion (Inorder):");
        inorder(root);

        sc.close();
    }
}
