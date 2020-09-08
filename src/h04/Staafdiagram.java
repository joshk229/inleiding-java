package h04;

import java.applet.Applet;
import java.awt.*;

public class Staafdiagram extends Applet {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(50,90,50,250);
        g.drawLine(50,250,250,250);
        g.setColor(Color.pink);
        g.fillRect(60,210,40,40);
        g.setColor(Color.blue);
        g.fillRect(110,150,40,100);
        g.setColor(Color.green);
        g.fillRect(160,170,40,80);
        g.setColor(Color.pink);
        g.drawString("Valerie", 60, 270);
        g.setColor(Color.blue);
        g.drawString("Jeroen", 110, 270);
        g.setColor(Color.green);
        g.drawString("Hans", 160, 270);
        g.setColor(Color.black);
        g.drawString("0", 40, 260);
        g.drawString("20", 30, 240);
        g.drawString("40", 30, 220);
        g.drawString("60", 30, 200);
        g.drawString("80", 30, 180);
        g.drawString("100", 20, 160);
        g.drawString("120", 20, 140);
        g.drawString("140", 20, 120);
        g.drawString("160", 20, 100);
    }
}
