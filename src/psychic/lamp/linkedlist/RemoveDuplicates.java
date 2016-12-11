/**
 * CtCI -  2.1
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
package psychic.lamp.linkedlist;

import java.util.HashSet;

public class RemoveDuplicates {

	/**
	 * Removes duplicates from the given list using a temporary buffer
	 * @param list Pointer to the head of the list whose duplicates need to be removed
	 */
	public static void removeDuplicatesWithBuffer(LinkedList list)
	{
		HashSet<Integer> unique = new HashSet<Integer>();
		Node current = list.getHead(), prev = null;
		while(current != null)
		{
			if(!unique.add(current.getData()))
			{
				prev.setNext(current.getNext());
			}
			else
			{
				prev = current;
			}
			current = current.getNext();
		}
	}
	
	/**
	 * Removes duplicates from the given list without using a temporary buffer
	 * Complexity of this is O(n)^2 since each element is compared to every other element in the list.
	 * @param list Pointer to the head of the list whose duplicates need to be removed
	 */
	public static void removeDuplicatesWithoutBuffer(LinkedList list)
	{
		Node current = list.getHead();
		while(current != null && current.getNext() != null)
		{
			Node temp = current;
			while(temp.getNext() != null)
			{
				if(current.getData() == temp.getNext().getData())
				{
					temp.setNext(temp.getNext());
					temp.setNext(temp.getNext().getNext());;
				} 
				else
				{
					temp = temp.getNext();
				}
			}
			current = current.getNext();
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
        list.addMultiple(7, 9, 7, 13, 7, 15, 17, 7, 7, 7, 19, 17);
        list.display();
        RemoveDuplicates.removeDuplicatesWithoutBuffer(list);
        list.display();
	}

}
