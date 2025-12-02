import java.util.*;

public class question51 {

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

    static void inorder(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = null;

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);

        if (list.size() < 2) {
            System.out.println("No 2nd minimum exists.");
        } else {
            System.out.println("2nd Minimum = " + list.get(1));
        }

        sc.close();
    }
}
