import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class question28 {

    // Insert element into BST
    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);
        return root;
    }

    // In-order traversal to store sorted values
    static int index = 0;
    static void inorder(Node root, int[] arr) {
        if (root == null)
            return;

        inorder(root.left, arr);
        arr[index++] = root.data;
        inorder(root.right, arr);
    }

    // Tree Sort function
    static void treeSort(int[] arr, int n) {
        Node root = null;

        // Build the BST
        for (int i = 0; i < n; i++) {
            root = insert(root, arr[i]);
        }

        // Reset index for storing sorted array
        index = 0;

        // In-order traversal → sorted array
        inorder(root, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        treeSort(arr, n);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
