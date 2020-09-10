package h06;

import java.applet.Applet;
import java.awt.*;

public class OpdrachtEen extends Applet {

    int a;
    int b;
    int c;
    int d;
    int e;
    int uitkomst;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
            g.drawString("Jan krijgt: " + uitkomst, 20, 40);
        g.drawString("Ali krijgt: " + uitkomst, 20, 60);
        g.drawString("Jeannette krijgt: " + uitkomst, 20, 80);
        g.drawString("Josh krijgt: " + uitkomst, 20, 100);
        g.drawString("euro",105,40);
        g.drawString("euro",105,60);
        g.drawString("euro",142,80);
        g.drawString("euro",115,100);



        ;


    }

    @Override
    public void init() {
        super.init();
        a=1;
        b=1;
        c=1;
        d=1;
        e=113;
        uitkomst=e/(a+b+c+d);



    }
}
