
class Node {
	public int  data;
	public Node next;
	
	public Node(int value) {
		this.data = value;
		this.next = null;
	}
}

public class SinglyLinkedList {
	private Node head;
	private Node tail;
	
	public SinglyLinkedList() {
		head = null;
		tail = null;
	}
	
	public String displayList() {
		boolean first = true;
		String  display = "[";
		for (Node current = head; current != null; current = current.next) {
			display += (!first ? ", " : "") + current.data;
			first = false;
		}
		display += "]";
		return display;
	}
	
	public void clear() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
        
		return false;
	}
	
	public void append(int value) {

	}
	
	public Object get(int position) {

		return null;
	}
	
	public void set(int position, int value) {

	}
	
	public boolean contains(int value) {

		return false;
	}
	
	public void addAll(SinglyLinkedList otherlist) {
		
	}
	
}

