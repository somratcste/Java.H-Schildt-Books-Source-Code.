
public class first {
	
	public static void main(String args[]){
		
		char chars[]={'a','b','c'};
		String s=new String(chars);
		String s1=new String(s);
		System.out.println(s);
		System.out.println(s1);
		byte as[]={65,66,67,68,69,70};
		String b=new String(as);
		System.out.println(b);
		String i=new String(as,2,3);
		System.out.println(i);
		String ms="who are you." + 
		           "where you come from ?" +
				"how are you.";
		System.out.println(ms + i);
		System.out.println("four : " + (2+2));
		System.out.println("The String lesson in this part have been finished.");
		
	}
}
