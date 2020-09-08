package h04;

import java.applet.Applet;
import java.awt.*;

public class Huis extends Applet {


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        g.drawRect(150, 120, 80, 60);
        g.drawRect(155,150,20,30);
        g.drawRect(190,150,20,20);
    }

}


}

