
class dynstack implements intstack{
	private int stck[];
	private int tos;
	dynstack(int size)
	{
		stck=new int[size];
		tos=-1;
	}
	public void push(int item)
	{
		if(tos==stck.length-1){
			int temp[]=new int[stck.length*2];
			for(int i=0;i<stck.length;i++)
				temp[i]=stck[i];
			     stck=temp;
			      stck[++tos]=item;
		}
		else
			stck[++tos]=item;
	}
	public int pop()
	{
		if(tos<0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
			return stck[tos--];
	}
}

public class Itfest2 {
	public static void main(String args[]){
		dynstack mystackone1=new dynstack(5);
		dynstack mystacktwo1=new dynstack(8);
		
		for(int i=0;i<15;i++)
			mystackone1.push(i);
		
		for(int i=0;i<18;i++)
			mystacktwo1.push(i);
		
		System.out.println("Stack in mystack");
		for(int i=0;i<15;i++)
			System.out.println(mystackone1.pop());
		
		System.out.println("Stack in mystack two");
		for(int i=0;i<18;i++)
			System.out.println(mystacktwo1.pop());
	}

}
