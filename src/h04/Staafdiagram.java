package h04;

import java.applet.Applet;
import java.awt.*;

public class Staafdiagram extends Applet {


    public void paint(Graphics g) {
        super.paint(g);


        int startY = 250;
        int weightValerie = 40;
        int weightJeroen = 100;
        int weightHans = 80;


        g.drawString("Valerie(40kg)", 40, 40);
        g.setColor(Color.pink);
        g.fillRect(60, startY - weightValerie, 40, weightValerie);
        g.setColor(Color.blue);
        g.fillRect(110, startY - weightJeroen, 40, weightJeroen);
        g.setColor(Color.green);
        g.fillRect(160, startY - weightHans, 40, weightHans);
        g.setColor(Color.black);


        g.drawLine(50,90,50,250);
        g.drawLine(50,250,300,250);


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


        g.setColor(Color.pink);
        g.drawString("Valerie", 60, 270);
        g.setColor(Color.blue);
        g.drawString("Jeroen", 110, 270);
        g.setColor(Color.green);
        g.drawString("Hans", 160, 270);
        g.setColor(Color.black);
    }
}
