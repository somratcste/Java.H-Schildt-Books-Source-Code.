package control;

public class Break {
	public static void main(String args[]){
		boolean t=true;
		first: {
			second : {
			  third : {
			  System.out.println("this is third");
			  
				
			
		     }
		System.out.println("this is second");
		if(t)
			break first;
			
		   }
		System.out.println("this is first");
		}
	}

}
