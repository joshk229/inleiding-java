package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    public void paint(Graphics g) {
        int getal = 1;
        int getal2= 1;
        int x = 10;

        while (getal < 90) {
            x += 50;
            g.drawString("" + getal + " " + getal2,x,20);
            getal += getal2;
            getal2 += getal;
        }
    }
}
