package Demo;
public class RecoverBSTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static TreeNode first = null;
    static TreeNode second = null;
    static TreeNode prev = null;

    static void recoverTree(TreeNode root) {
        findNodes(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    static void findNodes(TreeNode root) {
        if (root == null) {
            return;
        }

        findNodes(root.left);

        if (prev != null && prev.val > root.val) {
            if (first == null) {
                first = prev;
            }
            second = root;
        }

        prev = root;

        findNodes(root.right);
    }

    static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);

        System.out.print("Before recovery: ");
        inorder(root);

        recoverTree(root);

        System.out.print("\nAfter recovery: ");
        inorder(root);
    }
}
