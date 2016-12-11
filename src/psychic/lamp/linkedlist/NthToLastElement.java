/**
 * 
 */
package psychic.lamp.linkedlist;

/**
 * Implement an algorithm to find the nth to last element of a singly linked list.
 * @author vishakha
 *
 */
public class NthToLastElement {
	
	/**
	 * Returns Nth to the last element of a singly linked list
	 * @param list List in which the Nth to the last element is to be found
	 * @param n The index of the Nth element
	 * @return Nth node to the last element
	 */
	public static Node findNthToLastElement(LinkedList list, int n)
	{
		Node head = list.getHead();
		Node current = head, runner = head;
		
		for(int i = 0; i < n; i++)
		{
			if(runner == null)
			{
				System.out.println("N is larger then the list length.");
				return null;
			}
			else 
			{
				runner = runner.getNext();
			}
				
		}
		
		while(runner != null)
		{
			runner = runner.getNext();
			current = current.getNext();
		}
		return current;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
        list.addMultiple(7, 9, 11, 13, 15, 17, 19, 21, 23);
        list.display();
        int n = 10;
        Node elem = NthToLastElement.findNthToLastElement(list, n);
        if(elem != null)
        	System.out.println("#"+n+" to last element is: "+elem.getData());
        int n1 = 5;
        Node elem1 = NthToLastElement.findNthToLastElement(list, n1);
        if(elem1 != null)
        	System.out.println("#"+n1+" to last element is: "+elem1.getData());
	}

}
