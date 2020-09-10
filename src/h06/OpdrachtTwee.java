package h06;

import java.applet.Applet;
import java.awt.*;

public class OpdrachtTwee extends Applet {
    int sec;
    int uur;
    int dag;
    int jaar;

    @Override
    public void init() {
        super.init();
    sec=60;
    uur=60;
    dag=24;
    jaar=8760;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hoeveel seconden zitten in een uur."+sec*uur,20,40);
        g.drawString("Hoeveel seconden zitten in een dag."+(sec*uur)*dag,20,60);
        g.drawString("Hoeveel seconden zitten in een jaar."+(sec*uur)*jaar,20,80);


    }
}
