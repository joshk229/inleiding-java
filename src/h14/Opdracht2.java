package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;
import java.util.Random;

public class Opdracht2 extends Applet {
    String[] vorm = {"Harten", "Schoppen", "Klaver", "Ruiten"};
    String[] betekenis = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Vrouw", "Heer"};
    String[] spel;
    Button delen;

    private AudioClip sound;
    private URL pad;

    boolean[] help;
    int start = 0;


    public void init() {
        setSize(500, 300);
        pad= Opdracht2.class.getResource("/H014/resources/");
        sound = getAudioClip(pad, "applaus.wav");

        delen = new Button("Deel kaarten.");
        delen.addActionListener(new VerdeelListener());
        add(delen);

        spel= new String[52];
        help = new boolean[52];

        for (int i = 0; i < help.length; i++) {
            help[i] = false;
        }

        for (int i = 0; i < 13; i++) {
            spel[start] = vorm[0] + "" + betekenis[i];
            start++;
        }

        for (int i = 0; i < 13; i++) {
            spel[start] = vorm[1] + "" + betekenis[i];
            start++;
        }

        for (int i = 0; i < 13; i++) {
            spel[start] = vorm[2] + "" + betekenis[i];
            start++;
        }

        for (int i = 0; i < 13; i++) {
            spel[start] = vorm[3] + "" + betekenis[i];
            start++;
        }
    }

    public void paint(Graphics g) {
        g.drawString("Speler 1",50,50);
        g.drawString("Speler 2",150,50);
        g.drawString("Speler 3",250,50);
        g.drawString("Speler 4",350,50);

        int b = 0;
        for (int i = 0; i < 4; i++) {
            for (int a = 0; a < 13; a++) {
                g.drawString(spel[b], 50 + 110 * i,70 + 12 * a);
                b++;
            }
        }
    }

    public static void Random(String[] randomize) {
        Random randomize1;
        for (int i = 0; i < randomize.length; i++) {
            randomize1 = new Random();
            int randPos = randomize1.nextInt(randomize.length);
            String tmp = randomize[i];
            randomize[i] = randomize[randPos];
            randomize[randPos] = tmp;
        }
    }

    private class VerdeelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random(spel);
            repaint();
            sound.play();
        }
    }
}
