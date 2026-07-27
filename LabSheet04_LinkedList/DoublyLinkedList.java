
public class DoublyLinkedList {
	
	// Attributes in Class DoublyLinkedList
	private Node head;
	private Node tail;
	
	// Default Constructor
	public DoublyLinkedList () {
		this.head = null;
		this.tail = null;
	}
	
	// Method for traverse all nodes
	public String traversal() {
		Node current_node = head;
		String result = "[";
		boolean first = true;
		while (current_node != null) {
			result += (!first ? ", " : "") + current_node.data;
			current_node = current_node.next;
			first = false;
		}
		result += "]";
		return result;
	}

	// Method for inserting at the end of list
	public void insert(Object value) {
		
	}
	
	// Method for inserting at the beginning and specific position
	public void insert(int position, Object value) {
		
	}

	// Method for deleting the last node
	public void remove() {
		if (head != null) {  // check if the list is NOT empty list
			if (head.next == null) {  // check if the list has only 1 node -> make the list to empty list
				head = null;
				tail = null;
			} else {
				// write statement for deleting the last node
				
			}
		}
	}
	
	// Method for deleting at the beginning and specific position
	public void remove(int position) {
		if (head != null) {  // check if the list is NOT empty list
			if (head.next == null) {  // check if the list has only 1 node -> make the list to empty list
				head = null;
				tail = null;
			} else if (position == 0) {
				// write statement for deleting the beginning
				
			} else {
				// write statement for deleting the specific position
				
			}
		}
	}

	// Method for a backward traversal (from the last node to the first node)
	public String backwardTraversal() {
		return null;
	}
	
}
