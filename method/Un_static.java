package method;
class usestatic{
	static int a=3;
	static int b;
	static void method(int x)
	{
		System.out.println("x : " +x);
		System.out.println("a : " +a);
		System.out.println("b : " +b);
	}
	static{
		System.out.println(" Static block initialized.");
		b=a*4;
	}
}
public class Un_static {
	public static void main(String args[]){
		usestatic.method(42);
	}

}
