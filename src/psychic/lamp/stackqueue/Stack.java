package psychic.lamp.stackqueue;
import psychic.lamp.linkedlist.*;

public class Stack {
	
	Node top = new Node();
	
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

	public Integer pop()
	{
		if(top != null)
		{
			Integer data = top.getData();
			top = top.getNext();
			return data;
		}
		return null;
	}
	
	public void push(Integer data)
	{
		Node temp = new Node(data);
		temp.setNext(top);
		top = temp;
	}
	
	public void display()
	{
		if(top == null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			while(top != null)
			{
				System.out.print(top.getData() + " ");
				top = top.getNext();
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
