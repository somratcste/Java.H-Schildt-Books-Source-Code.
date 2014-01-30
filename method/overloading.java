package method;
class test{
	int a,b;
	test(int i,int j){
		a=i;
		b=j;
	}
	boolean equals(test o){
		if(o.a==a && o.b==b)
			return true;
		else
			return false;
	}
}

public class overloading {
//using object as parameters
	public static void main(String args[]){
		test obone=new test(100,222);
		test obtwo=new test(100,22);
		test obthree=new test(100,22);
		System.out.println("obone==obtwo: " +obtwo.equals(obthree));
		System.out.println("obonw==obthree: "+ obone.equals(obthree));
		
		
	}
}
