package Demo;
import java.util.Stack;
public class IterativePostorder {
	    static class Node {
	        int data;
	        Node left;
	        Node right;

	        Node(int data) {
	            this.data = data;
	            this.left = null;
	            this.right = null;
	        }
	    }

	    static void postorder(Node root) {

	        if (root == null) {
	            return;
	        }

	        Stack<Node> stack1 = new Stack<>();
	        Stack<Node> stack2 = new Stack<>();

	        stack1.push(root);

	        while (!stack1.isEmpty()) {

	            Node current = stack1.pop();
	            stack2.push(current);

	            if (current.left != null) {
	                stack1.push(current.left);
	            }

	            if (current.right != null) {
	                stack1.push(current.right);
	            }
	        }

	        while (!stack2.isEmpty()) {
	            Node current = stack2.pop();
	            System.out.print(current.data + " ");
	        }
	    }

	    public static void main(String[] args) {

	        Node root = new Node(50);

	        root.left = new Node(30);
	        root.right = new Node(70);

	        root.left.left = new Node(20);
	        root.left.right = new Node(40);

	        root.left.right.left = new Node(35);

	        root.right.left = new Node(60);
	        root.right.right = new Node(80);

	        System.out.println("Postorder Traversal:");
	        postorder(root);
	    }
}

