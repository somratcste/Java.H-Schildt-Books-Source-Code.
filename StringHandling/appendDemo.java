
public class appendDemo {
	public static void main(String args[]){
		String s;
		int a= 42;
		StringBuffer sb = new StringBuffer();
		s = sb.append("a = " ) .append(a) .append( "!") .toString();
		System.out.println(s);
		System.out.println(sb);
		StringBuffer so=new StringBuffer ("I java.");
		so.insert(2, "like ");
		System.out.println(so);
		so.reverse();
		System.out.println(so);
		so.reverse();
		so.delete(2, 6);
		System.out.println(so);
		so.deleteCharAt(0);
		System.out.println(so);
		so.replace(2, 6, "love");
		System.out.println(so);
	
	}

}
