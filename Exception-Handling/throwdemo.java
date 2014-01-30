
public class throwdemo {
	static void demoproc(){
		try {
			throw new NullPointerException ("demo.");
		} catch (NullPointerException ob){
			System.out.println("Exception : " + ob);
			throw ob;
		}
	}
	public static void main(String args[]){
		try {
			demoproc();
		} catch (NullPointerException e){
			System.out.println("Recaught : " + e);
		}
	}

}
