package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    Button Buttons[] = new Button[25];

    public void init() {
        for (int i = 0; i != 25; i++) {
            Buttons[i] = new Button("Knop " + String.valueOf(i + 1));
            add(Buttons[i]);
        }
    }
}
