import java.awt.*;
import java.applet.*;

public class first extends Applet {
	public void init(){
		setBackground(Color.blue);
		setForeground(Color.green);
	}
	public void start(){
		
	}
	
	
	public void paint(Graphics g){
		setForeground(Color.green);
		g.drawRect(50, 100, 450, 300);
		g.fillRect(50, 100, 450, 300);
		
		g.drawRoundRect(20, 30, 40, 50, 60, 70);
		setForeground(Color.red);
		g.fillRoundRect(20, 30, 40, 50, 60, 70);
		g.drawString("i love java programming.", 20, 40);
		showStatus("My Window.");
	}

}
