
public class equalsequals {
    public static void main(String args[] ){
    	String s1="hello";
    	String s2="HELLO";
    	String s3="hello";
    	System.out.println(s1.equals(s3));
    	System.out.println(s1.equalsIgnoreCase(s2));
    	System.out.println("Foobar" .startsWith("Foo"));
    	System.out.println("Foobar".endsWith("bar"));
    	System.out.println("Foobar" .startsWith("bar", 3));
    	String s4=new String(s1);
    	System.out.println(s1.equals(s4));
    	System.out.println(s1==s4);
    }
}
