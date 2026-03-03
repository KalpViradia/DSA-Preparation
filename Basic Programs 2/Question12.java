import java.util.*;

public class Question12 {

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

    static void inorder(Node root, Map<Integer, Integer> map) {
        if (root == null) return;
        inorder(root.left, map);
        map.put(root.data, map.getOrDefault(root.data, 0) + 1);
        inorder(root.right, map);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node root = null;

        System.out.println("Enter " + n + " BST values:");
        for (int i = 0; i < n; i++)
            root = insert(root, sc.nextInt());

        Map<Integer, Integer> map = new HashMap<>();
        inorder(root, map);

        int max = Collections.max(map.values());

        for (int key : map.keySet()) {
            if (map.get(key) == max)
                System.out.print(key + " ");
        }

        sc.close();
    }
}