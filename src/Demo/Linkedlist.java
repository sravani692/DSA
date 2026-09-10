/* linked list is the linear data structure where elements are stored in nodes where eachh node generally contains.
 * 1.data the actual point
 * 2.next reference/pointer
 * unlike an array linked list do not need to be stored in an continous memory location.
 * WHY WE NEED LINKED LIST
 * 1.linkedlist are useful when we frequently insert element,delete,element dynaminacally increase or decrease the size.
 * avoid shifting elements like an array.
 */
package Demo;

public class Linkedlist {
	
    static class Node {

	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    Node head;

	    void insertAtEnd(int data) {

	        Node newNode = new Node(data);

	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node current = head;

	        while (current.next != null) {
	            current = current.next;
	        }

	        current.next = newNode;
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

	        Linkedlist list = new Linkedlist();

	        list.insertAtEnd(10);
	        list.insertAtEnd(20);
	        list.insertAtEnd(30);
	        list.insertAtEnd(40);

	        list.display();
	    }
	}
		


