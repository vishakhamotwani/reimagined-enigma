package psychic.lamp.stackqueue;
import java.util.NoSuchElementException;

import psychic.lamp.linkedlist.*;



/**
 * A stack is a LIFO sequence. Addition and removal takes place only at one end, called the top.
 * You can query the size of the stack and
 * ask whether it is empty, push items, pop items, and peek at the top
 * item.
 * Reference: http://cs.lmu.edu/~ray/notes/stacks/
 * @author vishakha
 *
 */
public class Stack {
	
	Node top = null;
	private int size = 0;
	public Stack(Node top) {
		super();
		this.top = top;
	}
	
	public Stack(Integer data) {
		top.setData(data);
		top.setNext(null);
	}
	
	public Stack() {
	}

	/**
     * Removes the top item from the stack and returns it.
     */
	public Integer pop()
	{
		if(top != null)
		{
			Integer data = top.getData();
			top = top.getNext();
			size--;
			return data;
		}
		return null;
	}
	/**
     * Adds the given item to the top of the stack.
     */
	public void push(Integer data)
	{
		Node temp = new Node(data);
		if(top != null) 
		{
			temp.setNext(top);
		}
		top = temp;
		size++;
	}
	
	/**
     * Returns the top item from the stack without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public Integer peek()
    {
    	if(size == 0)
    	{
    		throw new NoSuchElementException("Cannot peek into empty queue");
    	}
    	return top.getData();
    }

    /**
     * Returns the number of items currently in the stack.
     */
    public int size()
    {
    	return size;
    }

    /**
     * Returns whether the stack is empty or not.
     */
    public boolean isEmpty()
    {
    	return size == 0;
    }
	
	public void display()
	{
		Node curr = top;
		if(curr == null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			while(curr != null)
			{
				System.out.print(curr.getData() + " ");
				curr = curr.getNext();
			}
		}
	}
	public static void main(String[] args) {
		Stack s = new Stack(7);
		s.push(8);
		s.push(9);
		System.out.println(s.pop());
		s.push(10);
		s.push(11);
		s.push(12);
		System.out.println(s.pop());
		s.display();
	}

}
