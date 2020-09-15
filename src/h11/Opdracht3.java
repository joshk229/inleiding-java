package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    public void paint(Graphics g) {
        int getal = 1;
        int x = 10;
        int getal1 =1;

        while (getal < 10000000){
            x += 40;
            getal += getal1;
            getal1+=getal:

            g.drawString(""+getal+""+getal1,x,10);

        }
    }
}
