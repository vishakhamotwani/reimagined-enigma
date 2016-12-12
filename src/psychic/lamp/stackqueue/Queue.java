package psychic.lamp.stackqueue;

import java.util.NoSuchElementException;

import psychic.lamp.linkedlist.Node;

/**
 * A queue is a FIFO sequence. Addition takes place only at the tail, and removal takes place only at the head.
 * A small queue class.  You can query the size of the queue and
 * ask whether it is empty, add and remove items, and peek at the front
 * item.
 * Reference: http://cs.lmu.edu/~ray/notes/queues/
 * @author vishakha
 */

public class Queue {
	//Head will be used for removing the item at the head - dequeue
	Node head;
	//Tail will be used for adding the item at the tail - enqueue
	Node tail;
	private int size = 0;
	public Queue() {
	}

	/**
     * Adds the given item to the rear/tail of the queue.
     * @param data Data to be added
     */
	public void enqueue (Integer data)
	{
		Node temp = new Node(data);
		if(tail != null)
		{
			tail.setNext(temp);
			tail = temp;
			size++;
		}
		else
		{
			tail = temp;
			head = temp;
			size++;
		}
	}
	
	/**
     * Removes the front item from the queue and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
	public Integer dequeue() 
	{
		if(head == null)
		{
			throw new NoSuchElementException("Cannot remove from empty queue");
		}
		else
		{
			Integer item = head.getData();
			head = head.getNext();
			size--;
			return item;
		}
	}
	
	/**
     * Returns the front item from the queue without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public Integer peek()
    {
    	if(size == 0)
    	{
    		throw new NoSuchElementException("Cannot peek into empty queue");
    	}
    	return head.getData();
    }

    /**
     * Returns the number of items currently in the queue.
     */
    public int size()
    {
    	return size;
    }

    /**
     * Returns whether the queue is empty or not.
     */
    public boolean isEmpty()
    {
    	return size == 0;
    }
	
	/**
	 * Displays the queue from head to tail
	 */
	public void display()
	{
		Node current = head;
		while(current != null)
		{
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		q.enqueue(11);
		System.out.println("Peek: "+q.peek());
		q.enqueue(12);
		q.enqueue(13);
		System.out.println("Peek: "+q.peek());
		q.enqueue(14);
		q.display();
		System.out.println("~"+q.dequeue());
		System.out.println("Is empty: "+q.isEmpty());
		System.out.println("Peek: "+q.peek());
		q.display();
		System.out.println("Size: "+q.size());
		System.out.println("~"+q.dequeue());
		System.out.println("Peek: "+q.peek());
		//System.out.println("~"+q.dequeue());
		q.display();
	}

}
