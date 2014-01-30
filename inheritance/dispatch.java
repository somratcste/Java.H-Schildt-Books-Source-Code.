package inheritance;
class A2{
	void callme()
	{
		System.out.println("Inside a's call me");
	}
}
class B2 extends A2{
	void callme()
	{
		System.out.println("inside B's call me");
	}
}
class C2 extends A2{
	void callme()
	{
		System.out.println("inside C's call me");
	}
}

public class dispatch {
	public static void main(String args[]){
		A2 a=new A2();
		B2 b=new B2();
		C2 c=new C2();
		A2 r;
		r=a;
		r.callme();
		r=b;
		r.callme();
		r=c;
		r.callme();
	}

}
