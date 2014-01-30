import java.io.*;

public class trimmethod {
	public static void main(String args[])

	  throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		String str;
		System.out.println("Enter 'stop' to quit.");
		
		do {
			System.out.println("Enter state : ");
			str = br.readLine();
			str = str.trim();
			if(str.equals("illonois"))
				System.out.println("Capital is springfield");
			else if (str.equals("california"))
				System.out.println("capital is sacromento.");
		} while (!str.equals("stop"));
		
		StringBuffer sb= new StringBuffer("hello");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

}
