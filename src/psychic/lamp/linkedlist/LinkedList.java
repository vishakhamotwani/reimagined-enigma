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
	
	/**
	 * Traverses the linked list and displays each element
	 */
	public void display()
	{
		Node current = head;
		while(current != null)
		{
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println("\n-----------------\n");
	}
	
	/**
	 * Adds the given data to the list, makes it a head if the list is empty
	 * @param data
	 */
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
	
	/**
	 * Adds the passed random number of elements to the list
	 * @param args Elements to be added to the list
	 */
	public void addMultiple(Integer... args)
	{
		for(Integer arg : args)
		{
			this.add(arg);
		}
	}
	
	/**
	 * The data to be deleted from the list
	 * @param data
	 */
	public void delete(Integer data)
	{
		if(head == null)
		{
			System.out.println("The list is empty!");
		} 
		else if(head.getData() == data)
		{
			head = head.getNext();
		}
		else
		{
			Node current = head.getNext();
			Node prev = head;
			while(current != null)
			{
				if(current.getData() == data)
				{
					prev.setNext(current.getNext());
					break;
				}
				prev = prev.getNext();
				current = current.getNext();
			}
			if(current == null)
			{
				System.out.println("Data not found!");
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedList tempLinkedList = new LinkedList(8);
		tempLinkedList.addMultiple(10, 12, 14, 16, 18, 20);
        tempLinkedList.display();
        System.out.println("Deleting 8...");
        tempLinkedList.delete(8);
        tempLinkedList.display();
        LinkedList noHeadList = new LinkedList();
        noHeadList.addMultiple(7, 9, 11, 13, 15, 17);
        noHeadList.display();
        System.out.println("Deleting 13...");
        noHeadList.delete(13);
        noHeadList.display();
        System.out.println("Deleting 17...");
        noHeadList.delete(17);
        noHeadList.display();
        System.out.println("Deleting 19...");
        noHeadList.delete(19);
        noHeadList.display();
	}

}
