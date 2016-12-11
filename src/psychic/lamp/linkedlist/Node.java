package psychic.lamp.linkedlist;

public class Node
{
    private Integer data;
    private Node next;

    public Node (Integer element)
    {
        data = element;
        next = null;
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

