package Demo;

public class BinaryTreeHeight {
	
	    static class Node {
	        int data;
	        Node left;
	        Node right;

	        // Create node
	        Node(int data) {
	            this.data = data;
	        }
	    }

	    static int height(Node root) {

	        // Empty tree
	        if (root == null) {
	            return 0;
	        }

	        // Find left height
	        int leftHeight = height(root.left);

	        // Find right height
	        int rightHeight = height(root.right);

	        // Return maximum height
	        return Math.max(leftHeight, rightHeight) + 1;
	    }

	    public static void main(String[] args) {

	        // Create tree
	        Node root = new Node(50);

	        root.left = new Node(30);
	        root.right = new Node(70);

	        root.left.left = new Node(20);
	        root.left.right = new Node(40);

	        root.left.right.left = new Node(35);

	        root.right.left = new Node(60);
	        root.right.right = new Node(80);

	        // Display height
	        System.out.println("Height of Binary Tree: " + height(root));
	    }
	
}
