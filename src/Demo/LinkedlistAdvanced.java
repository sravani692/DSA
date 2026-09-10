 package Demo;

public class LinkedlistAdvanced {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void insertFirst(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    void insertLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void reverse() {

        Node prev = null;
        Node current = head;

        while (current != null) {

            Node nextNode = current.next;

            current.next = prev;
            prev = current;
            current = nextNode;
        }

        head = prev;
    }

    int findMiddle() {

        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    boolean hasCycle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    void display() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        LinkedlistAdvanced list = new LinkedlistAdvanced();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);

        System.out.println("Original List:");
        list.display();

        System.out.println("Middle Element: " + list.findMiddle());

        System.out.println("Has Cycle: " + list.hasCycle());

        list.reverse();

        System.out.println("Reversed List:");
        list.display();
   }

}