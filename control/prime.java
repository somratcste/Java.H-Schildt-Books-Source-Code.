package control;

public class prime {
	public static void main(String args[]){
		int num=13;
		boolean prime=true;
		for(int i=2;i<=num/i;i++){
			if(num%2==0){
				prime=false;
				break;
			}
		}
		if(prime)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

}
