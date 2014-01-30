package method;

public class String_object {
	public static void main(String args[]){
		String obone="first strin";
		String obtwo="second strin";
		String obthree=obone;
		System.out.println("length os obone : "+obone.length());
		System.out.println("cahr at index 3 is : "+obtwo.charAt(3));
		if(obone.equals(obthree))
			System.out.println("this are equals");
		else
			System.out.println("this are not equal");
	}

}
