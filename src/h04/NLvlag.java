package h04;

import java.applet.Applet;
import java.awt.*;

public class NLvlag extends Applet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(100,120,80,20);
        g.setColor(Color.white);
        g.fillRect(100,140,80,20);
        g.setColor(Color.blue);
        g.fillRect(100,160,80,20);
        g.setColor(Color.black);
        g.drawLine(100,120,100,250);
    }
}
