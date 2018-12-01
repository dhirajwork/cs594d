import java.applet.Applet;  
    import java.awt.*;
    import java.net.*; 
import java.awt.event.*;
/*    
<applet code="KeyDemo.class" width="500" height="300">   
</applet> 
*/
 public class KeyDemo extends Applet implements KeyListener{ 
String msg="hi";
    public void init(){

      setBackground(Color.cyan);
      addKeyListener(this);  
  
    } 
 public void keyReleased(KeyEvent k)
 {
   showStatus("KeyRealesed");
 }
public void keyPressed(KeyEvent k)
 {
   showStatus("KeyPressed");
 }
public void keyTyped(KeyEvent k)
 {
   msg = msg+k.getKeyChar();
   repaint();
 }
    public void paint(Graphics g){  
       g.drawString(msg,10,30);
     }
    }
