package psychic.lamp.linkedlist;
/**
 * CtCI -  2.3
 * Implement an algorithm to delete a node in the middle of a single linked list, given
 * only access to that node.
 * EXAMPLE
 * Input: the node ‘c’ from the linked list a->b->c->d->e
 * Result: nothing is returned, but the new linked list looks like a->b->d->e
 * @author vishakha
 *
 */
public class DeleteGivenNode {

	/**
	 * Deletes a node in the middle of a single linked list, given
     * only access to that node.
	 * @param toDelete Node to be deleted
	 */
	public static void deleteAGivenNode(Node toDelete) 
	{
		Node temp = toDelete.getNext();
		toDelete.setData(temp.getData());
		toDelete.setNext(temp.getNext());
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
        list.getHead().getNext().getNext().getNext().getNext().setNext(a);
        list.display();
        DeleteGivenNode.deleteAGivenNode(b);
        list.display();
        DeleteGivenNode.deleteAGivenNode(list.getHead());
        list.display();
	}

}
