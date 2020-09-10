package h06;

import java.applet.Applet;
import java.awt.*;

public class OpdrachtDrie extends Applet {

int uitkomst;
int a;
int b;

    @Override
    public void init() {
        super.init();
        a=2147483647;
        b=5;
        uitkomst=a+b;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("uitkomst is: " +uitkomst,20,20);
    }
}
