package inheritance;
class A{
	int i,j;
	void showij()
	{
		System.out.println(i + " " + j);
	}
}
class B extends A{
	int k;
	void showk(){
		System.out.println(k);
	}
	void sum()
	{
		System.out.println(+(i+j+k));
	}
}

public class basic {
	public static void main(String args[]){
		A superob=new A();
		B subob=new B();
		superob.i=10;
		superob.j=20;
		superob.showij();
		System.out.println();
		subob.i=30;
		subob.j=40;
		subob.k=20;
		subob.showij();
		subob.showk();
		subob.sum();
	}

}
