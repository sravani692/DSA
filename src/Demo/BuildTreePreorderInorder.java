package Demo;

public class BuildTreePreorderInorder {

    static class Node {

        int data;
        Node left;
        Node right;

        // Create node
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int preIndex = 0;

    // Build tree
    static Node buildTree(int[] preorder, int[] inorder,
                          int left, int right) {

        // Check empty tree
        if (left > right) {
            return null;
        }

        // Get root value
        int rootValue = preorder[preIndex];

        // Move preorder index
        preIndex++;

        // Create root
        Node root = new Node(rootValue);

        // Find root in inorder
        int rootIndex = findIndex(
                inorder, left, right, rootValue);

        // Create left subtree
        root.left = buildTree(
                preorder,
                inorder,
                left,
                rootIndex - 1
        );

        // Create right subtree
        root.right = buildTree(
                preorder,
                inorder,
                rootIndex + 1,
                right
        );

        // Return root
        return root;
    }

    // Find root position
    static int findIndex(int[] inorder,
                         int left,
                         int right,
                         int value) {

        // Search in inorder
        for (int i = left; i <= right; i++) {

            if (inorder[i] == value) {
                return i;
            }
        }

        return -1;
    }

    // Inorder traversal
    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.data + " ");

        inorder(root.right);
    }

    // Preorder traversal
    static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorder(root.left);

        preorder(root.right);
    }

    // Postorder traversal
    static void postorder(Node root) {

        if (root == null) {
            return;
        }

        postorder(root.left);

        postorder(root.right);

        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        // Preorder array
        int[] preorder = {
            50, 30, 20, 40, 35, 70, 60, 80
        };

        // Inorder array
        int[] inorder = {
            20, 30, 35, 40,50, 60, 70, 80
        };

        // Reset index
        preIndex = 0;

        // Build tree
        Node root = buildTree(
                preorder,
                inorder,
                0,
                inorder.length - 1
        );

        // Print preorder
        System.out.println("Preorder Traversal:");
        preorder(root);

        System.out.println();

        // Print inorder
        System.out.println("Inorder Traversal:");
        inorder(root);

        System.out.println();

        // Print postorder
        System.out.println("Postorder Traversal:");
        postorder(root);
    }
}