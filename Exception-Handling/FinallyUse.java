
public class FinallyUse {
	static void proca(){
		try {
			System.out.println("Inside proc A ");
			throw new RuntimeException("Demo");
		}finally {
			System.out.println("Proc A's Finally.");
		}
	}
	
	static void procB(){
		try {
			System.out.println("Inside procB.");
			return ;
		} finally {
			System.out.println("porc's B Finally.");
		}
	}
	
	static void procc(){
		try {
			System.out.println("Inside proc C.");
		}finally {
			System.out.println("Porc c's finally ");
		}
	}
	 
	public static void main(String args[]){
		try {
			proca();
		} catch (Exception e){
			System.out.println("Exception Caught " + e);
		}
		procB();
		procc();
	}
}
