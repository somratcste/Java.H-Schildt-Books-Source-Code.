package method;
class outer1{
	int outerx=100;
	void test()
	{
		for(int i=0;i<10;i++)
		{
			class Inner{
				void display()
				{
					System.out.println("outer x is : "+ outerx);
				}
				
			}
			Inner inner=new Inner();
			inner.display();
			
		}
	}
}
public class Nested_class {
	public static void main(String args[]){
		outer1 ob=new outer1();
		ob.test();
	}

}
