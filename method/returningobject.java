package method;
class test1 {
	int a;
	test1(int i)
	{
		a=i;
	}
	test1 incrbyten()
	{
		test1 temp=new test1(a+10);
		return temp;
	}
}
public class returningobject {
	public static void main(String args[]){
		test1 obone=new test1(2);
		test1 obtwo;
		obtwo=obone.incrbyten();
		System.out.println(obone.a);
		System.out.println(obtwo.a);
		obtwo=obtwo.incrbyten();
    	System.out.println(obtwo.a);
	}

}
