/**
 * CtCI -  3.1
 * Describe how you could use a single array to implement three stacks.
 */
package psychic.lamp.stackqueue;

/**
 * @author vishakha
 *
 */
public class ThreeStacks {
	
	int stacksize = 300;
	int[] stackbuffer = new int[stacksize*3];
	int[] stackpointer = {0, 0, 0};

	/**
	 * Pushes the element onto the given stack#
	 * @param stackNum which of the 3 stacks
	 * @param value what value
	 */
	void push(int stackNum,int value)
	{
		//Find the index of the topmost element
		int index = stackNum*stacksize + stackpointer[stackNum] + 1;
		stackpointer[stackNum]++;
		stackbuffer[index] = value;
	}
	
	/**
	 * Deletes the topmost element from the given stack#
	 * @param stackNum which of the 3 stacks 0,1,2?
	 * @return the deleted value
	 */
	int pop(int stackNum)
	{
		int index = stackNum*stacksize + stackpointer[stackNum];
		int value = stackbuffer[index];
		//Reseting it to zero
		stackbuffer[index] = 0;
		stackpointer[stackNum]--;
		return value;
	}
	
	/**
	 * Returns the topmost element without deleting it
	 * @param stackNum which of the 3 stacks
	 * @return topmost value
	 */
	int peek(int stackNum)
	{
		int index = stackNum*stacksize + stackpointer[stackNum];
		int value = stackbuffer[index];
		return value;
	}

	/**
	 * Whether the given stack# is empty
	 * @param stackNum which of the 3 stacks
	 * @return true if the stack is empty
	 */
	boolean isEmpty(int stackNum)
	{
		return stackpointer[stackNum] == stackNum*stacksize;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeStacks ts = new ThreeStacks();
		for (int i = 1; i < 10; i++) 
		{
			ts.push(0, i);
		}
		System.out.println("~~~"+ts.stackpointer[0]);
		for (int i = 11; i < 20; i++) 
		{
			ts.push(1, i);
		}
		System.out.println("~~~"+ts.stackpointer[1]);
		for (int i = 600; i < 800; i++) 
		{
			ts.push(2, i);
		}
		System.out.println("~~~"+ts.stackpointer[2]);
		for (int i = 1; i < 10; i++) 
		{
			System.out.println(ts.pop(0));
		}
		System.out.println(ts.peek(0));
		System.out.println(ts.isEmpty(0));
		System.out.println(ts.peek(1));
		System.out.println(ts.peek(2));
	}

}
