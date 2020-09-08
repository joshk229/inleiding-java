package h04;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        g.fillRect(10,10,70,180);
        g.setColor(Color.red);
        g.fillOval(20,15,50,50);
        g.setColor(Color.orange);
        g.fillOval(20,70,50,50);
        g.setColor(Color.green);
        g.fillOval(20,125,50,50);

    }
}
