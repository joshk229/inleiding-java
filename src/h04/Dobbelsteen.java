package h04;

import java.applet.Applet;
import java.awt.*;

public class Dobbelsteen extends Applet {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRoundRect(50,50,100,100,20,10);
        g.fillOval(60,60,30,30);
        g.fillOval(60,110,30,30);
        g.fillOval(110,60,30,30);
        g.fillOval(110,110,30,30);

    }
}
