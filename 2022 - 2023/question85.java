import java.util.*;

public class question85 {

    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static Node insert(Node r, int v) {
        if (r == null) return new Node(v);
        if (v < r.data) r.left = insert(r.left, v);
        else r.right = insert(r.right, v);
        return r;
    }

    static Node addRow(Node root, int val, int depth) {
        if (depth == 1) {
            Node newNode = new Node(val);
            newNode.left = root;
            return newNode;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 1;

        while (!q.isEmpty()) {
            int size = q.size();
            if (level == depth - 1) {
                while (size-- > 0) {
                    Node node = q.poll();
                    Node leftTemp = node.left;
                    Node rightTemp = node.right;

                    node.left = new Node(val);
                    node.left.left = leftTemp;

                    node.right = new Node(val);
                    node.right.right = rightTemp;
                }
                break;
            }
            while (size-- > 0) {
                Node node = q.poll();
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            level++;
        }

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
            root = insert(root, sc.nextInt());

        System.out.print("Enter value to add: ");
        int v = sc.nextInt();

        System.out.print("Enter depth: ");
        int d = sc.nextInt();

        root = addRow(root, v, d);

        System.out.println("Inorder after adding row:");
        inorder(root);

        sc.close();
    }
}
