
interface intstack{
	void push(int item);
	int pop();
}

class fixedstack implements intstack{
	private int stck[];
	private int tos;
	fixedstack(int size)
	{
		stck=new int[size];
		tos=-1;
	}
	
	public void push(int item)
	{
		if(tos==stck.length-1)
			System.out.println("Stack is full");
		else
			stck[++tos]=item;
	}
	
	public int pop()
	{
		if(tos<0){
			System.out.println("Stack underflow");
			return 0;
		}
		else
			return stck[tos--];
	}
}

public class IFtest {
public static void main(String args[]){
	fixedstack mystackone=new fixedstack(5);
	fixedstack mystacktwo=new fixedstack(8);
	
	for(int i=0;i<5;i++)
		mystackone.push(i);
	
	for(int i=0;i<8;i++)
		mystacktwo.push(i);
	
	System.out.println("Stack in mystack");
	for(int i=0;i<5;i++)
		System.out.println(mystackone.pop());
	
	System.out.println("Stack in mystack two");
	for(int i=0;i<8;i++)
		System.out.println(mystacktwo.pop());
}
}
