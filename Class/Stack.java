
class teststack{
	int stck[]=new int[10];
	int tos;
	teststack(int tos)
	{
		this.tos=tos;
	}
	void push(int item)
	{
		if(tos==9)
		{
			System.out.println("Stack is full");
		}
		else
			stck[++tos]=item;
	}
	int pop()
	{
		if(tos<0){
			System.out.println("Stack Underflow");
		return 0;
		}
		else
			return stck[tos--];
	}
	
}

public class Stack {
	public static void main(String args[]){
		teststack mystack=new teststack(-1);
		for(int i=0;i<10;i++)
			mystack.push(i);
		
		for(int i=0;i<10;i++)
			System.out.println(mystack.pop());
		
	}

}