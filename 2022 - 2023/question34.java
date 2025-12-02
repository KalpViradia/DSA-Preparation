import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class question34 {

    // Insert a node into the BST
    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Function to print leaf nodes
    public static void printLeafNodes(Node root) {
        if (root == null) {
            return;
        }

        // If node is a leaf
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }

        // Recur on left and right children
        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = null;

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter the node values:");
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        System.out.println("Leaf Nodes:");
        printLeafNodes(root);

        sc.close();
    }
}
