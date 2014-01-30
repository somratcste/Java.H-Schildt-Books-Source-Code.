class box5{
	double width;
	double height;
	double depth;
	double volume()
	{
		return width*height*depth;
	}
	void set(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
}
public class boxdemo5 {
	public static void main(String args[]){
		box5 mybox5=new box5();
		double vol;
		mybox5.set(10,20,30);
		vol=mybox5.volume();
		System.out.println("volume is : "+ vol);
	}
}
