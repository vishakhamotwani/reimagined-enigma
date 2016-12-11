/**
 * Generic operations implementation of linked list with a Node class
 */
package psychic.lamp.linkedlist;

/**
 * @author vishakha
 *
 */
public class LinkedList {

	private Node head;
	
	/**
	 * @return Node head
	 */
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public LinkedList(Node head) {
		super();
		this.head = head;
	}

	public LinkedList(Integer item)
    {
        head = new Node(item);
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList tempLinkedList = new LinkedList(8);
        System.out.println(tempLinkedList.getHead().getData());
	}

}
