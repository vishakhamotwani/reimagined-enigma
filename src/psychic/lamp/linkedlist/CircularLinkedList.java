package psychic.lamp.linkedlist;

/**
 * CtCI -  2.5
 * Given a circular linked list, implement an algorithm which returns node at the beginning
 * of the loop.
 * DEFINITION
 * Circular linked list: A (corrupt) linked list in which a node’s next pointer points to an
 * earlier node, so as to make a loop in the linked list.
 * EXAMPLE
 * input: A -> B -> C -> D -> E -> C [the same C as earlier]
 * output: C
 * @author vishakha
 *
 */
public class CircularLinkedList {

	public Node findLoopBegining(Node head) 
	{
		Node runner, current;
		current = runner = head;
		while(runner.getNext() != null)
		{
			current = current.getNext();
			runner = runner.getNext().getNext();
			if(current == runner)
			{
				break;
			}
		}
		if(runner.getNext() == null)
		{
			System.out.println("List is not circular");
			return null;
		}
		/* Move current to Head. Keep runner at Meeting Point.  Each are k (2) steps
		   from the Loop Start. If they move at the same pace, they must
		   meet at Loop Start. */
		current = head;
		while(current != runner)
		{
			current = current.getNext();
			runner = runner.getNext();
		}
		return runner;
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Node a;
		a = new Node(7);
        list.setHead(a);
        a = new Node(8);
        list.getHead().setNext(a);
        a = new Node(9);
        list.getHead().getNext().setNext(a);
        a = new Node(11);
        list.getHead().getNext().getNext().setNext(a);
        Node b = list.getHead().getNext().getNext().getNext();
        a = new Node(13);
        list.getHead().getNext().getNext().getNext().setNext(a);
        a = new Node(15);
        a.setNext(b);
        list.getHead().getNext().getNext().getNext().getNext().setNext(a);
        //list.display();
        CircularLinkedList cll = new CircularLinkedList();
        Node loopNode = cll.findLoopBegining(list.getHead());
        if(loopNode != null)
        {
        	System.out.println(loopNode.getData());
        }
        
        list = new LinkedList();
        list.addMultiple(7, 9, 11, 13, 15, 17, 19, 21, 23);
        //list.display();
        loopNode = cll.findLoopBegining(list.getHead());
        if(loopNode != null)
        {
        	System.out.println("~"+loopNode.getData());
        }
	}

}
