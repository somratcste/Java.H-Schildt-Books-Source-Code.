
public class second {
	public static void main(String args[]){
		String  msg = "G.M.Nazmul Hossain Somrat.";
		try {
		for(int i=0;i<msg.length();i++){
			Thread.sleep(1000);
			System.out.print(i + " "); 
		}
	} catch (InterruptedException e){
		System.out.println(e);
	}

}
}
