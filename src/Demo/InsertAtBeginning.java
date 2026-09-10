/*Insert at the beginniing suppose the linked list contains(10,20,30) we want to insert 5 and create a new node the result insert be 5,10,20,30.*/
package Demo;

public class InsertAtBeginning {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	Node head = null;
	// Insert at beginning
	void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	//Display linked List
	void display() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		InsertAtBeginning List = new InsertAtBeginning();
		//Insert in reverse order
		List.insertAtBeginning(30);
		List.insertAtBeginning(20);
		List.insertAtBeginning(10);
		List.insertAtBeginning(5);
	List.display();
		
		}
}
