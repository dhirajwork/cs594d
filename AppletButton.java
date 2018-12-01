import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;

/*
<applet code="AppletButton",height="200" width="200">
	<param name="Red" value="RED">
	<param name="Blue" value="BLUE">
	<param name="Green" value="GREEN">
</applet>
*/

public class AppletButton extends Applet{
	public void init(){
		Button b1, b2, b3;
		b1 = new Button(getParameter("Red"));
		b2 = new Button(getParameter("Blue"));
		b3 = new Button(getParameter("Green"));
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setBackground(Color.RED);
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setBackground(Color.BLUE);
			}
		});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setBackground(Color.GREEN);
			}
		});
		this.add(b1);
		this.add(b2);
		this.add(b3);
	}
}

