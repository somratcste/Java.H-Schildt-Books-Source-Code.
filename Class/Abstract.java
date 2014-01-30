abstract class figure{
	double dim;
	double dimone;
	figure(double a,double b)
	{
		dim=a;
		dimone=b;
	}
	abstract double area();
}

class rectangle extends figure{
	rectangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Inside area of rectangle : ");
		return dim*dimone;
	}
}

class triangle extends figure{
	triangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("inside area for triangle : ");
		return dim*dimone;
	}
}
public class Abstract {
	public static void main(String args[]){
		rectangle r=new rectangle(9,5);
		triangle t=new triangle(10,8);
		figure f;
		f=r;
		System.out.println(f.area());
		f=t;
		System.out.println(f.area());
		
	}

}
