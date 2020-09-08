package h04;

import java.applet.Applet;
import java.awt.*;

public class Driehoek extends Applet {
    @Override
    public void init() {
        super.init();
        setBackground(Color.white);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int[] x = {100, 70, 130};
        int[] y = {50, 100, 100};
        g.drawPolygon(x, y, 3);
    }
}




