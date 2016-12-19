/**
 * CtCI -  3.2
 * How would you design a stack which, in addition to push and pop, also has a function
 * min which returns the minimum element? Push, pop and min should all operate in
 * O(1) time.
 */
package psychic.lamp.stackqueue;


public class MinInStack extends Stack{

	Integer MIN = Integer.MAX_VALUE;
	Stack stackOfMins;
	
	
	public MinInStack() {
		stackOfMins = new Stack();
	}

	void push(int value)
	{
		if(value <= min())
		{
			stackOfMins.push(value);
		}
		super.push(value);
	}

	public Integer pop()
	{
		int value = super.pop();
		if(value == min())
		{
			stackOfMins.pop();
		}
		return value;
	}
	
	int min()
	{
		if(stackOfMins.isEmpty())
		{
			return MIN;
		}
		return stackOfMins.peek();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinInStack s = new MinInStack();
		s.push(15);
		s.push(14);
		s.display();
		System.out.println("\nMin:"+s.min());
		System.out.println("\npop-----"+s.pop());
		System.out.println("\nMin:"+s.min());
		s.push(5);
		s.push(12);
		System.out.println("Min:"+s.min());
		s.push(11);
		System.out.println(s.pop());
		s.display();
		System.out.println("\nMin:"+s.min());
	}

}
