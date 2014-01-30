
public class indexofdemo {
  public static void main(String args[]){
	  String s= "Now is the time for all good men " + 
                " to come to  the aid of their country.";
	  System.out.println(s);
	  System.out.println("Index of (t) = " + s.indexOf("the",8));
	  System.out.println("Index of last(t) = " + s.lastIndexOf("the",55));
	  String or="Thisme isme a test.";
	  String search="isme";
	  String sub="was";
	  String result="";
	  int i;
	  do{
		  System.out.println(or);
		  i=or.indexOf(search);
		  if(i!= -1){
			  result=or.substring(0, i);
			  result=result+sub;
			  result=result+or.substring(i+search.length());
			  or=result;
		  }
				  
	  }while(i!=-1);
	  
	  System.out.println(s.concat(or));
	  String rep="hello world" .replace('l', 'w');
	  System.out.println(rep);
	  
  }
}
