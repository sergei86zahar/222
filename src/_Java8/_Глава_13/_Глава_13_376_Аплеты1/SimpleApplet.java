package _Java8._Глава_13._Глава_13_376_Аплеты1;
import java.applet.Applet;
import java.awt.*;
/*
<applet code="SimpleApplet" width=200 height=60>
</applet>

 */
public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Простейший аплет",20, 20);
    }
}
