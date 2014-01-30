package first;
import java.awt.*;
import java.applet.*;

public class appl extends Applet{
	public void paint(Graphics g){
		g.drawString("This is an applet." , 20,20);
		g.drawLine(0, 0, 100, 150);
		g.drawRect(10, 10, 50, 25);
	
	}

}
 