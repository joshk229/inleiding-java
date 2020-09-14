package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    double tekst;
    double getal;
    double Laagstegetal;

    public void init() {

        getal = 9;
        Laagstegetal =9;
        tekstvak = new TextField("",10);
        tekstvak.addActionListener(new Tekstvaklistener());
        label = new Label("Typ een getal in en druk op enter.");

        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString("hoogste getal is:" + getal,10,50);
        g.drawString("laagste getal is:" + Laagstegetal,10,70);
    }

    private class Tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s=tekstvak.getText();
            tekst=Double.parseDouble(s);
            if (tekst > getal){
                getal=tekst;
            }
            if (tekst < Laagstegetal) {
                Laagstegetal = tekst;
            }

            repaint();

        }
    }

}
