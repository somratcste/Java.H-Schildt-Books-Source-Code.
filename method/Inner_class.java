package method;
class outer{
	int outerx=100;
	void test()
	{
		Inner inner=new Inner();
		inner.display();
	}
	class Inner{
		void display()
		{
			System.out.println("display outer x : "+ outerx);
		}
	}
}

public class Inner_class {
	public static void main(String args[]){
		outer ou=new outer();
		ou.test();
	}

}
