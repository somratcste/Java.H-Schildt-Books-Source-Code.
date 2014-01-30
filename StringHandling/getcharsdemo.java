
public class getcharsdemo {
	public static void main(String args[]){
		char ch;
		ch="abc" .charAt(1);
		System.out.println(ch);
	  
	    String ab="bangladesh is an independent country";
	    int start=12;
	    int end=15;
	    char chup[]=new char[end-start];
	    ab.getChars(start, end, chup, 0);
	    System.out.println(chup);
	    System.out.println(ab.length());
	    char abe;
	    abe="bangladesh".charAt(4);
	    System.out.println(abe);
	    
	}
}
