package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {

    //Declaratie
    Label label;
    TextField tekstvak;
    double gemiddelde;
    int aantalCijfers;
    boolean voldoende;
    Button submit;

    public void init() {

        //Initalisatie
        label = new Label("Voer een cijfer in");
        tekstvak =  new TextField("",5);
        submit = new Button("Submit");
        submit.addActionListener(new knoplistenerSubmit());

        aantalCijfers = 0;
        gemiddelde = 0.0;

        add(tekstvak);
        add(submit);
    }

    public void paint(Graphics g) {
        g.drawString("Je gemiddelde cijfer: " + gemiddelde,50,50);
        g.drawString("Is het cijfer voldoende? " + voldoende,50,70);
        g.drawString("Aantal cijfers: " + aantalCijfers,50,90);
    }

    private class knoplistenerSubmit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Double Cijfer =  Double.parseDouble(tekstvak.getText());
            voldoende = Cijfer >= 5.5;
            gemiddelde = ((gemiddelde * aantalCijfers) + Cijfer) / (aantalCijfers + 1);
            gemiddelde =  gemiddelde * 10;
            int Gemiddelde_ = (int) gemiddelde;
            gemiddelde =  Gemiddelde_;
            gemiddelde = gemiddelde / 10;
            aantalCijfers++;
            repaint();

        }
    }
}
