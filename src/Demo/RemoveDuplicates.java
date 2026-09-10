package Demo;

public class RemoveDuplicates {
		static class Node {
			int data;
			Node next;
			
			Node(int data) {
				this.data = data;
			}
		}
		Node head;
		void removeDuplicates() {
			Node current = head;
			while (current != null && current.next != null) {
				if(current.data == current.next.data) {
					current.next = current.next.next;
				} else {
					current = current.next;
				}
			}
		}
		void display() {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " -> ");
				current = current.next;
			}
			System.out.println("null");
		}
		public static void main(String[] args) {
			RemoveDuplicates list = new RemoveDuplicates();
			
			Node n1 = new Node(10);
			Node n2 = new Node(20);
			Node n3 = new Node(20);
			Node n4 = new Node(30);
			Node n5 = new Node(30);
			
			list.head = n1;
			
			n1.next = n2;
			n2.next = n3;
			n3.next = n4;
			n4.next = n5;
			
			System.out.println("Before:");
			list.display();
			
			list.removeDuplicates();
			
			System.out.println("After:");
			list.display();
		}

}
