package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht2 extends Applet {
    int factor;
    long answer;
    Button ok;
    int i;


    public void init() {
        factor =0;
        answer=0;
        ok= new Button("ok");
        ok.addActionListener(new Submit());
        add(ok);
    }

    public void paint(Graphics g) {
        for (i=1; i<=10; i++){
            answer= factor *i;
            g.drawString(""+answer,100,i*20+30);
            g.drawString("1 x " + factor + "=",50,50);
            g.drawString("2 x " + factor + "=",50,70);
            g.drawString("3 x " + factor + "=",50,90);
            g.drawString("4 x " + factor + "=",50,110);
            g.drawString("5 x " + factor + "=",50,130);
            g.drawString("6 x " + factor + "=",50,150);
            g.drawString("7 x " + factor + "=",50,170);
            g.drawString("8 x " + factor + "=",50,190);
            g.drawString("9 x " + factor + "=",50,210);
            g.drawString("10 x " + factor + "=",45,230);
        }
    }

    private class Submit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            i= Integer.parseInt(String.valueOf(factor++));
            if (factor > 10) {
                factor =1;
            }
            repaint();

        }
    }
}