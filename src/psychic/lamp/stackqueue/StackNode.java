package psychic.lamp.stackqueue;

public class StackNode {

	private int data;
	private int previous;

    public StackNode (int element)
    {
        data = element;
        previous = -1;
    }
    
    public StackNode ()
    {
    }
    
    public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getPrevious() {
		return previous;
	}

	public void setPrevious(int previous) {
		this.previous = previous;
	}
}
