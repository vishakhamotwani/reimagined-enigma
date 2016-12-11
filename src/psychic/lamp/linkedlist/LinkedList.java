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

	public LinkedList()
	{
		
	}
	
	public LinkedList(Integer item)
    {
        head = new Node(item);
    }
	
	public void add(Integer data) 
	{
		//If it is the first element in the list
		if(head == null)
		{
			head = new Node(data);
		} 
		else 
		{
			Node element = new Node(data);
			Node current = head;
			while(current.getNext() != null)
			{
				current = current.getNext();
			}
			current.setNext(element);
		}
	}
	
	public void display()
	{
		Node current = head;
		System.out.println("Printing the list:");
		while(current.getNext() != null)
		{
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	public void addMultiple(Integer... args)
	{
		for(Integer arg : args)
		{
			this.add(arg);
		}
	}
	
	public static void main(String[] args) {
		LinkedList tempLinkedList = new LinkedList(8);
		tempLinkedList.addMultiple(10, 12, 14, 16);
        tempLinkedList.display();
        LinkedList noHeadList = new LinkedList();
        noHeadList.addMultiple(7, 9, 11, 13, 15);
        noHeadList.display();
	}

}
