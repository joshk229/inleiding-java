package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    double tekst;
    double getal;

    public void init() {

        getal = 9;
        tekstvak = new TextField("",10);
        tekstvak.addActionListener(new Tekstvaklistener());
        label = new Label("Typ een getal in en druk op enter.");

        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString("hoogste getal is:" + getal,10,50);
    }

    private class Tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           s=tekstvak.getText();
           tekst=Double.parseDouble(s);
            if (tekst > getal){
                getal=tekst;
            }
            repaint();

        }
    }
}
