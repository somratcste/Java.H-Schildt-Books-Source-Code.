import java.io.*;

public class fin {
	public static void main(String args[])
	   throws IOException
	{
		int i;
		FileInputStream sin;
		try {
			sin=new FileInputStream (args[0]);
		} catch (FileNotFoundException e){
			System.out.println("File not found.");
			return ;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage : showfile file.");
			return ;
		}
		
		do {
			i = sin.read();
			if(i!=-1)
				System.out.print((char) i );
		} while (i != -1);
		
		sin.close();
	}

}
