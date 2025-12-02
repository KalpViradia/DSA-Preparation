import java.util.*;

public class question86 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int v) { val = v; }
    }

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    static TreeNode sortedListToBST(ArrayList<Integer> arr, int l, int r) {
        if (l > r) return null;

        int mid = (l + r) / 2;
        TreeNode root = new TreeNode(arr.get(mid));

        root.left = sortedListToBST(arr, l, mid - 1);
        root.right = sortedListToBST(arr, mid + 1, r);

        return root;
    }

    static void inorder(TreeNode r) {
        if (r == null) return;
        inorder(r.left);
        System.out.print(r.val + " ");
        inorder(r.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListNode head = null, tail = null;

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Enter sorted list values:");
        for (int i = 0; i < n; i++) {
            ListNode nn = new ListNode(sc.nextInt());
            if (head == null) head = tail = nn;
            else { tail.next = nn; tail = nn; }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }

        TreeNode root = sortedListToBST(arr, 0, arr.size() - 1);

        System.out.println("BST Inorder:");
        inorder(root);

        sc.close();
    }
}
