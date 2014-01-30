package method;
class factorial1{
	int fact(int n)
	{
		int result;
		if(n==1)
			return 1;
		else
			result=fact(n-1)*n;
		
		
		return result;
	}
}

public class factorial {
	public static void main(String args[]){
		factorial1 ob=new factorial1();
		System.out.println("factorial 5 is : "+ ob.fact(5));
		
	}
}


