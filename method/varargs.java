package method;
class passarray{
	static void valtest(int ... v){
		System.out.println("no. of " + v.length+ " is " );
	
		for(int x:v)
			System.out.println(x+ " ");
		System.out.println();
	}
}

public class varargs {
	public static void main(String args[]){
		
	passarray.valtest(10);
	passarray.valtest(1,2,3);
	passarray.valtest();
	}

}
