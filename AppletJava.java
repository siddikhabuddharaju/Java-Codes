import java.applet.Applet;
import java.awt.Graphics;
 public class AppletJava extends Applet{
    public void paint (Graphics g){
        g.drawString("Hello Java",100,100);
    }
 }
 /*
 <html>
  <body>
    <applet width="150" height="150" code="AppletJava.class">
    </applet>
  </body>
</html>
*/
