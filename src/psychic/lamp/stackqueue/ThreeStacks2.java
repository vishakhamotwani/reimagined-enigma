/**
 * CtCI -  3.1
 * Describe how you could use a single array to implement three stacks.
 * Approach 2
 */
package psychic.lamp.stackqueue;


public class ThreeStacks2 {

	int stacksize = 300;
	int currentIndex = 0;
	StackNode[] stackbuffer = new StackNode[stacksize*3];
	int[] stackpointer = {-1, -1, -1};
	
	/**
	 * Pushes the element onto the given stack#
	 * @param stackNum which of the 3 stacks
	 * @param value what value
	 */
	void push(int stackNum,int value)
	{
		StackNode newElem = new StackNode(value);
		if(stackpointer[stackNum] > -1)
		{
			newElem.setPrevious(stackpointer[stackNum]);
		}
		stackpointer[stackNum] = currentIndex;
		stackbuffer[stackpointer[stackNum]] = newElem;
		currentIndex++;
	}
	
	/**
	 * Deletes the topmost element from the given stack#
	 * @param stackNum which of the 3 stacks 0,1,2?
	 * @return the deleted value
	 */
	int pop(int stackNum)
	{
		int value = stackbuffer[stackpointer[stackNum]].getData();
		int previous = stackbuffer[stackpointer[stackNum]].getPrevious();
		stackpointer[stackNum] = previous;
		return value;
	}
	
	/**
	 * Returns the topmost element without deleting it
	 * @param stackNum which of the 3 stacks
	 * @return topmost value
	 */
	int peek(int stackNum)
	{
		if(stackpointer[stackNum] > -1)
		{
			int value = stackbuffer[stackpointer[stackNum]].getData();
			return value;
		} 
		else
		{
			return -1;
		}
	}

	/**
	 * Whether the given stack# is empty
	 * @param stackNum which of the 3 stacks
	 * @return true if the stack is empty
	 */
	boolean isEmpty(int stackNum)
	{
		return stackpointer[stackNum] == -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeStacks2 ts = new ThreeStacks2();
		for (int i = 0; i < 10; i++) 
		{
			ts.push(0, i);
		}
		System.out.println("~~~"+ts.stackpointer[0]);
		for (int i = 10; i < 20; i++) 
		{
			ts.push(1, i);
		}
		System.out.println("~~~"+ts.stackpointer[1]);
		for (int i = 600; i < 800; i++) 
		{
			ts.push(2, i);
		}
		System.out.println("~~~"+ts.stackpointer[2]);
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(ts.pop(0));
		}
		System.out.println(ts.peek(0));
		System.out.println(ts.isEmpty(0));
		System.out.println(ts.peek(1));
		System.out.println(ts.peek(2));
	}

}
