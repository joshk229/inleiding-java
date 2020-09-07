package h02;

import java.applet.Applet;
import java.awt.*;

public class Les02 extends Applet {
    @Override
    public void init() {
        super.init();
        setBackground(Color.white);
    }

    @Override
    public void paint (Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        g.drawString("Josh", 50, 60);
        super.paint(g);
        g.setColor(Color.red);
        g.drawString("Kumar", 80, 60);
    }
}
