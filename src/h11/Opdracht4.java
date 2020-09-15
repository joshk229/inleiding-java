package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    public void paint(Graphics g) {
        int getal =0;
        int x =10;
        int tafel =3;

        while(getal < 10){
            x +=25;
            getal++;
            tafel = 3 * getal;
            g.drawString(""+ tafel,x,10);


        }
    }
}
