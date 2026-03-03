import java.util.*;

public class Question17 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int postIndex;

    static Node buildTree(int[] inorder, int[] postorder, int inStart, int inEnd) {

        if (inStart > inEnd) return null;

        Node root = new Node(postorder[postIndex--]);

        if (inStart == inEnd) return root;

        int inIndex = inStart;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.data) {
                inIndex = i;
                break;
            }
        }

        root.right = buildTree(inorder, postorder, inIndex + 1, inEnd);
        root.left = buildTree(inorder, postorder, inStart, inIndex - 1);

        return root;
    }

    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        int[] inorder = new int[n];
        int[] postorder = new int[n];

        System.out.println("Enter " + n + " inorder values:");
        for (int i = 0; i < n; i++)
            inorder[i] = sc.nextInt();

        System.out.println("Enter " + n + " postorder values:");
        for (int i = 0; i < n; i++)
            postorder[i] = sc.nextInt();

        postIndex = n - 1;

        Node root = buildTree(inorder, postorder, 0, n - 1);

        preorder(root);

        sc.close();
    }
}