
public class setcharatdemo {
	public static void main(String args[]){
		StringBuffer sb= new StringBuffer("hello");
		System.out.println(sb.charAt(1));
		sb.setCharAt(1, 'i');
		System.out.println(sb);
		sb.setLength(2);
		System.out.println(sb);
		
	}

}
