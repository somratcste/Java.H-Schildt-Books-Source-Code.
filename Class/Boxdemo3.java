class box1{
	double width;
	double height;
	double depth;
	double volume()
	{
		return (width*height*depth);
	}
}

public class Boxdemo3 {
	public static void main(String args[]){
	   	box1 mybox = new box1();
	   	box1 mybox1=new box1();
	   	mybox.width=10;
	   	mybox.height=15;
	   	mybox.depth=20;
	   	double vol1,vol2;
	   	vol1=mybox.volume();
	   	
	   	mybox1.width=1;
	   	mybox1.height=2;
	   	mybox1.depth=30;
	   	System.out.println();
	   	vol2=mybox1.volume();
	   	System.out.println(vol1 + " "+ vol2);
	}

}
