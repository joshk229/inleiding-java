package h06;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {
    double a;
    double b;
    double c;
    double uitkomst;

    @Override
    public void init() {
        super.init();
    a=5.9;
    b=6.3;
    c=6.9;
    uitkomst=(a+b+c)/3;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    g.drawString("gemiddelde van curist is "+uitkomst,20,20);
    }
}
