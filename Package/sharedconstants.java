
import java.util.Random;

interface share{
	int no=0;
	int yes=1;
	int maybe=2;
	int later=3;
	int soon=4;
	int never=5;
}

class question implements share{
	Random rand=new Random();
	int ask()
	{
		int prob=(int)(100 * rand.nextDouble());
		if(prob<30)
			return no;
		if(prob<60)
			return yes;
		if(prob<75)
			return later;
		if(prob<98)
			return soon;
		else
			return never;
	}
}

class askme implements share{
	static void answere (int result){
		switch(result)
		{
		case no:
			System.out.println("no");
			break;
			
		case yes:
			System.out.println("yes");
			break;
			
		case maybe:
			System.out.println("maybe");
			break;
			
		case later:
			System.out.println("later");
			break;
			
		case soon:
			System.out.println("soon");
			break;
			
		case never:
			System.out.println("never");
			break;
			
		}
	}
}

public class sharedconstants {
	public static void main(String args[]){
		question q=new question();
		askme a=new askme();
	    a.answere(q.ask());
	    a.answere(q.ask());
	    a.answere(q.ask());
	    a.answere(q.ask());
	    a.answere(q.ask());
	    a.answere(q.ask());
	    a.answere(q.ask());
	    a.answere(q.ask());
	}
	
}
