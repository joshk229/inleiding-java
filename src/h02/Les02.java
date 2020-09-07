package h02;

import java.applet.Applet;
import java.awt.*;

public class Les02 extends Applet {
    @Override
    public void init() {
        super.init();
        setBackground(Color.blue);
    }

    @Override
    public void paint (Graphics g) {
        super.paint(g);
        g.setColor(Color.yellow);
        g.drawString("Josh Kumar", 50, 60);
    }
}
