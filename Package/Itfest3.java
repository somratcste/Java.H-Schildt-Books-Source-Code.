
public class Itfest3 {
	public static void main(String args[]){
		intstack mystack;
		dynstack ds=new dynstack(5);
		fixedstack fs=new fixedstack(8);
		
		mystack=ds;
		for(int i=0;i<12;i++)
			mystack.push(i);
		
		mystack=fs;
		for(int i=0;i<8;i++)
			mystack.push(i);
		
		mystack=ds;
		for(int i=0;i<12;i++)
			System.out.println(mystack.pop());
		
		System.out.println("in mystack two : ");
		
		mystack=fs;
		for(int i=0;i<8;i++)
			System.out.println(mystack.pop());
		
	}

}
