package h04;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(10,10,100,10);
        g.drawString("Lijn.", 25,25 );
        g.drawRect(10,40,100,60);
        g.drawString("Rechthoek.", 25, 115);
        g.drawRoundRect(10,140,100,60,30,30);
        g.drawString("Afgeronde Rechthoek.", 5, 215);
        g.setColor(Color.magenta);
        g.fillRect(150,40,100,60);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal.", 130, 115);
        g.drawString("Gevulde ovaal.", 150, 215);
        g.drawOval(150,40,100,60);
        g.setColor(Color.magenta);
        g.fillOval(150,140,100,60);
        g.setColor(Color.black);
        g.drawOval(320,40,100,60);
        g.drawString("Taartpunt met ovaal eromheen.", 340, 115);
        g.drawOval(320,140,60,60);
        g.drawString("Circel.", 320, 215);
        g.setColor(Color.magenta);
        g.fillArc(320,40,100,60,0,45);
    }
}
