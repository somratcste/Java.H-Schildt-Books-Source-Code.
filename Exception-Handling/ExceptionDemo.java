class myexception extends Exception {
	
	private int detail;
	
	myexception (int a){
		System.out.println("somrat");
		detail=a;
	}
	
	public String toString() {
		System.out.println("nazmul ");
		return "myexception[" + detail+ "]";
	}
}

public class ExceptionDemo  {
	
static void compute(int a) throws myexception {
	System.out.println("Called compute ("+ a + ")");
	if(a>10)
		throw new myexception (a);
	System.out.println("Normal exit.");
}
public static void main(String args[]){
	try {
		compute(1);
		compute (20);
	} catch (myexception e){
		System.out.println("Caught : " + e );
	}
}
	
}
