package psychic.lamp.linkedlist;
/**
 * CtCI -  2.4
 * You have two numbers represented by a linked list, where each node contains a single
 * digit. The digits are stored in reverse order, such that the 1’s digit is at the head of
 * the list. Write a function that adds the two numbers and returns the sum as a linked
 * list.
 * EXAMPLE
 * Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
 * Output: 8 -> 0 -> 8
 * @author vishakha
 *
 */
public class NumbersAddition {

	/**
	 * Adds the numbers provided as linked list in a reverse order.
	 * @param head1 Head of the list of the first number
	 * @param head2 Head of the list of the second number
	 * @return Head of the result linked list, addition of the two numbers
	 */
	public static LinkedList addNumbers(Node head1, Node head2)
	{
		LinkedList result = new LinkedList();
		int sum = 0, carry = 0;
		int nodeData;
		while(head1 != null && head2 != null)
		{
			sum = head1.getData() + head2.getData() + carry;
			nodeData = sum % 10;
			carry = sum / 10;
			result.add(nodeData);
			head1 = head1.getNext();
			head2 = head2.getNext();
		}
		if(head1 != null)
		{
			while(head1 != null)
			{
				sum = head1.getData() + carry;
				nodeData = sum % 10;
				carry = sum / 10;
				result.add(nodeData);
				head1 = head1.getNext();
			}
		}
		if(head2 != null)
		{
			while(head2 != null)
			{
				sum = head2.getData() + carry;
				nodeData = sum % 10;
				carry = sum / 10;
				result.add(nodeData);
				head2 = head2.getNext();
			}
		}
		if(carry > 0)
		{
			result.add(carry);
		}
		return result;
	}
	
	public static void main(String[] args) {
		LinkedList list1, list2;
		list1 = new LinkedList();
        list1.addMultiple(5, 1, 3);
        /*list1.display();
        list1.reverse();*/
        list1.display();
        list2 = new LinkedList();
        list2.addMultiple(2, 9, 5);
        /*list2.display();
        list2.reverse();*/
        list2.display();
        NumbersAddition.addNumbers(list1.getHead(), list2.getHead()).display();
        
        list1 = new LinkedList();
        list1.addMultiple(2, 3, 6);
        list1.display();
        list2 = new LinkedList();
        list2.addMultiple(8, 9, 7);
        list2.display();
        NumbersAddition.addNumbers(list1.getHead(), list2.getHead()).display();
        
        list1 = new LinkedList();
        list1.addMultiple(9, 9);
        list1.display();
        list2 = new LinkedList();
        list2.addMultiple(9, 9, 9, 9);
        list2.display();
        NumbersAddition.addNumbers(list1.getHead(), list2.getHead()).display();
	}

}
