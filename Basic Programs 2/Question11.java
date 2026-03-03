import java.util.*;

public class Question11 {

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

    static void inorder(Node root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node root = null;

        System.out.println("Enter " + n + " BST values:");
        for (int i = 0; i < n; i++)
            root = insert(root, sc.nextInt());

        List<Integer> list = new ArrayList<>();
        inorder(root, list);

        if (list.size() >= 2)
            System.out.println(list.get(1));
        else
            System.out.println("Not enough nodes");

        sc.close();
    }
}