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
	 * Returns the head of the linked list
	 * @return Head of the linked list
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * Sets the given node as the head of the linked list
	 * @param head Node to be made the head of the linked list
	 */
	public void setHead(Node head) {
		this.head = head;
	}

	/**
	 * Constructor to create a linked list given a head node
	 * @param head Node with which to initialize the linked list
	 */
	public LinkedList(Node head) {
		super();
		this.head = head;
	}

	/**
	 * Default constructor that takes no arguments
	 */
	public LinkedList()
	{
		
	}
	
	/**
	 * Creates a linked list with the given item as the data of the head
	 * @param item Integer item to be head of the linked list
	 */
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
	 * @param data Data to be added as a node in the linked list
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
	 * Deletes the given element from the list
	 * @param data The data to be deleted from the list
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
	
	/**
	 * Replaces the node with the old value in the linked list with a new value
	 * @param oldValue Data to be replaced
	 * @param newValue Updated value
	 */
	public void update(Integer oldValue, Integer newValue)
	{
		if(head == null)
		{
			System.out.println("Cannot replace element, list is empty!");
		}
		else if(head.getData() == oldValue)
		{
			head.setData(newValue);
		}
		else
		{
			Node current = head;
			while(current != null)
			{
				if(current.getData() == oldValue)
				{
					current.setData(newValue);
					break;
				}
				current = current.getNext();
			}
			if(current == null)
			{
				System.out.println("Element to be replaced was not found!");
			}
		}
	}
	
	public void reverse()
	{
		if(head == null)
		{
			System.out.println("List is empty!");
		}
		else 
		{
			Node current = head, prev = null, next = null;
			while(current != null)
			{
				next = current.getNext();
				current.setNext(prev);
				prev = current;
				current = next;
			}
			head = prev;
		}
	}
	
	public static void main(String[] args) {
		//A new linked list
		/*LinkedList tempLinkedList = new LinkedList(8);
		tempLinkedList.addMultiple(10, 12, 14, 16, 18, 20);
        tempLinkedList.display();
        System.out.println("Deleting 8...");
        tempLinkedList.delete(8);
        tempLinkedList.display();*/
        LinkedList noHeadList = new LinkedList();
        noHeadList.addMultiple(7, 9, 11, 13, 15, 17);
        noHeadList.display();
        //-----Reverse------
        System.out.println("Reversing the linked list...");
        noHeadList.reverse();
        noHeadList.display();
        //-----Deletion-----
        /*System.out.println("Deleting 13...");
        noHeadList.delete(13);
        noHeadList.display();
        System.out.println("Deleting 17...");
        noHeadList.delete(17);
        noHeadList.display();
        System.out.println("Deleting 19...");
        noHeadList.delete(19);
        noHeadList.display();*/
        //-----Update------
        /*System.out.println("Updating 7 with 3...");
        noHeadList.update(7, 3);
        noHeadList.display();
        System.out.println("Updating 13 with 21...");
        noHeadList.update(13, 21);
        noHeadList.display();
        System.out.println("Updating 17 with 67...");
        noHeadList.update(17, 67);
        noHeadList.display();
        System.out.println("Updating 19 with 33...");
        noHeadList.update(19, 33);
        noHeadList.display();*/
	}

}
