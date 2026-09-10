package Demo;

public class Doublelinkedlist {
		static class Node {
			int data;
			Node prev;
			Node next;
			
			Node(int data) {
				this.data = data;
				this.prev = null;
				this.next = null;
				
			}
		}
		Node head;
		Node tail;
		
		void insertLast(int data) {
			Node newNode = new Node(data);
			
			if (head == null) {
				head = newNode;
				tail = newNode;
				return;
			}
			tail.next = newNode;
			newNode.prev = tail;
			
			tail = newNode;
		}
		void displayForward() {
			Node current = head;
			
			while (current != null) {
				System.out.print(current.data + " ⇄ ");
				current = current.next;
			}
			System.out.println("NULL");
		}
		void displayBackward() {
			Node current = tail;
			
			while (current != null) {
				System.out.print(current.data + " ⇄ ");
				current = current.prev;
			}
			System.out.println("NULL");
			
		}
		public static void main(String[] args) {
			Doublelinkedlist list = new Doublelinkedlist();
			
			list.insertLast(10);
			list.insertLast(20);
			list.insertLast(30);
			list.insertLast(40);
			
			System.out.println("Forward:");
			list.displayForward();
			
			System.out.println("Backward:");
			list.displayBackward();
		}

}

