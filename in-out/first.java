import java.io.*;

public class first {
   public static void main(String args[])
   
        throws IOException 
   {
	   PrintWriter pw = new PrintWriter(System.out, true);
	   pw.println("This is a string");
	   int j=-7;
	   pw.println(j);
	   double d=4.5e-7;
	   pw.println(d);
	   
	   int b;
	   b='A'; 
	   System.out.write(b);
	   System.out.write('\n');
	  
	   
	   BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	   char c;
	   System.out.println("press q to quit : ");
	   do {
		   c = (char) br.read();
		   System.out.println(c);
		   
	   }while (c!='q');
	   
	   String str;
	   System.out.println("press stop to break line.");
	   
	   do {
		   str=br.readLine();
		   System.out.println(str);
	   } while (!str.equals("stop"));
	   
	   String st[] = new String[100];
	   System.out.println("press stop to quite line . ");
	   
		   for(int i=0;i<100;i++){
			   st[i]=br.readLine();
			   if(st[i].equals("stop"))
				   break;
		   }
			   
			 for (int i=0;i<100;i++)
			 {
				 if(st[i].equals("stop"))
					 break;
				 System.out.println(st[i]);
				
			 }
			    
   }
}
