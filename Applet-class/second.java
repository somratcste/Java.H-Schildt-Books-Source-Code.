import java.awt.*;
import java.applet.*;

public class second extends Applet implements Runnable {
        String msg="Noakhali Science And Technology University. Computer Science And Telecommunication Engineering.";
        Thread t = null;
        boolean stopFlag;
        public void init(){
        	setBackground(Color.red);
        	setForeground(Color.green);
        }
        public void start(){
        	t=new Thread (this);
        	stopFlag=false;
        	t.start();
        }
        public void run(){
        	char ch ;
        	for(; ;){
        		try {
        			repaint();
        			Thread.sleep(250);
        			ch=msg.charAt(0);
        			msg=msg.substring(1,msg.length());
        			msg += ch;
        			if(stopFlag)
        				break;
        		} catch (InterruptedException e){}
        	}
        }
        public void stop(){
        	stopFlag = true;
        	t=null;
        }
        public void paint(Graphics g){
        	g.drawString(msg, 350, 330);
        	showStatus("java program.");
        }
        
		
}
