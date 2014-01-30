
public class chained {
	static void demoproc(){
		NullPointerException e = new NullPointerException("top layer.");
		e.initCause(new ArithmeticException("Cause."));
		throw e;
	}
	
	public static void main(String args[]){
		try{
			demoproc();
			
		}catch (NullPointerException e){
			System.out.println("caught : " + e);
			System.out.println("orginal cause : " + e.getCause());
		}
	}

}
