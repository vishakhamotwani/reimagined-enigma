/**
 * Node class to be used to create linked list nodes
 */
package psychic.lamp.linkedlist;
/**
 * @author vishakha
 *
 */
public class Node
{
    private Integer data;
    private Node next;

    public Node (Integer element)
    {
        data = element;
        next = null;
    }
    
    public Node ()
    {
    }

    public Integer getData()
    {
        return this.data;
    }

    public Node getNext()
    {
        return this.next;
    }

    public void setData(Integer element)
    {
        data = element;
    }

    public void setNext(Node element)
    {
        next = element;
    }
}

