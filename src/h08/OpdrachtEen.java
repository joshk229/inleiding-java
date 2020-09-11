package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class OpdrachtEen extends Applet {

    Button OkKnop;
    Button ResetKnop;
    Label Label;
    TextField Tekstvak;
    String S;

    public void init() {

        Tekstvak = new TextField("Klik hier");
        OkKnop = new Button("Ok");
        Label = new Label("Type hier iets!");
        ResetKnop = new Button("Reset");
        OkKnop.addActionListener(new KnoplistenerOkay() );
        ResetKnop.addActionListener(new KnoplistenerReset() );
        add(Label);
        add(Tekstvak);
        add(OkKnop);
        add(ResetKnop);
        S = "";
    }

    public void paint(Graphics g) {
        g.drawString("Type een tekst!" + "In het tekstvak" + "En klik op ok",50,60);
        g.drawString(S,60,80);
    }

    class KnoplistenerOkay implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            S = Tekstvak.getText();
            repaint();
        }

    }

    class KnoplistenerReset implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            Tekstvak.setText("");
            repaint();
        }
    }
}

