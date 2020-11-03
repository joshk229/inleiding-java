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
        int str=0;
        int y=260;
        int x= 20;


        g.setColor(Color.pink);
        g.fillRect(60, startY - weightValerie, 40, weightValerie);
        g.setColor(Color.blue);
        g.fillRect(110, startY - weightJeroen, 40, weightJeroen);
        g.setColor(Color.green);
        g.fillRect(160, startY - weightHans, 40, weightHans);
        g.setColor(Color.black);


        g.drawLine(50,90,50,250);
        g.drawLine(50,250,300,250);

        for ( int i=0; i<10; i++ )
        {
            g.drawString (""+str,x,y);
            str=str+20;
            y=y-20;
        }

        g.setColor(Color.pink);
        g.drawString("Valerie", 60, 270);
        g.setColor(Color.blue);
        g.drawString("Jeroen", 110, 270);
        g.setColor(Color.green);
        g.drawString("Hans", 160, 270);
        g.setColor(Color.black);
    }
}
