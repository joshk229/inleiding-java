package h04;

import java.applet.Applet;
import java.awt.*;

public class Ellips extends Applet {
    @Override
    public void init() {
        super.init();
        setBackground(Color.blue);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10,10,200,200);
        g.setColor(Color.yellow);
        g.fillArc(10,10,200,200,0,50);
    }
}
