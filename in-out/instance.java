class a{
	int i,j;
}
class b{
	int i,j;
}
class c extends a{
	int k;
}
class d extends a{
	int k;
}
public class instance {
     public static void main(String args[]){
    	 a one=new a();
    	 b two=new b();
    	 c three=new c();
    	 d four=new d();
    	 if(one instanceof a)
    		 System.out.println("one is an instance of a");
    	 
     }
}