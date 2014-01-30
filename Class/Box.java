
class boxdemo{
	double width;
	double height;
	double length;
}
public class Box {
	public static void main(String args[]){
		boxdemo mybox3=new boxdemo();
		mybox3.width=10;
		mybox3.height=20;
		mybox3.length=15;
		double vol;
		vol=mybox3.width * mybox3.height * mybox3.length;
		System.out.println("volume is : " + vol);
	}
	

}
