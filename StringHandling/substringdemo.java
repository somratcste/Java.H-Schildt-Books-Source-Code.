
public class substringdemo {
	public static void main(String args[]){
		StringBuffer sb= new StringBuffer ("i like java. i like .net ");
		sb.substring(2, 7);
		System.out.println(sb);
		sb.substring(3);
		System.out.println(sb);
		int i;
		i=sb.indexOf("like");
		System.out.println(i);
		i=sb.lastIndexOf("like");
		System.out.println(i);
	}

}
