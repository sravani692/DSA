package Demo;

public class DeleteNode {
		static class Node {
			int data;
			Node next;
			Node(int data){
				this.data = data;
			}
		}
		Node head;
		void insertAtEnd(int data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
				return;
			}
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		void delete(int value) {
			if(head == null) {
				return;
			}
			//If head itself contains the value
			if(head.data == value) {
				head = head.next;
				return;
			}
			Node current = head;
			while(current.next != null &&
					current.next.data != value) {
				current = current.next;
			}
			if(current.next != null) {
				current.next = current.next.next;
			}
		}
		void display() {
			Node current = head;
			while (current !=  null) {
				System.out.print(current.data + " -> ");
				current = current.next;
			}
			System.out.println("null");
			
			}
		public static void main(String[] args) {
			DeleteNode List = new DeleteNode();
			
			List.insertAtEnd(10);
			List.insertAtEnd(20);
			List.insertAtEnd(30);
			List.insertAtEnd(40);
			System.out.println("Before deletion:");
			List.display();
			List.delete(30);
			System.out.println("After deletion:");
			List.display();
			
		}

}

