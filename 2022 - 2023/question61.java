import java.util.*;

public class question61 {

    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val <= root.data) root.left = insert(root.left, val);
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
        for (int i = 0; i < n; i++) root = insert(root, sc.nextInt());

        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);

        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;

        for (int x : list) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(x));
        }

        System.out.println("Most Frequent Elements:");
        for (int key : freq.keySet()) {
            if (freq.get(key) == maxFreq) System.out.print(key + " ");
        }

        sc.close();
    }
}
