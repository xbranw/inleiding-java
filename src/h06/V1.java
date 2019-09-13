package h06;

import java.awt.*;
import java.applet.*;

public class V1  extends Applet {

    double bedrag;

    public void init() {
        bedrag = 113;
    }

    public void paint(Graphics g) {
        int y = 20;

        g.drawString("Jan: : " + bedrag / 4, 20, y);
        y += 20;
        g.drawString("Ali: : " + bedrag / 4, 20, y);
        y += 20;
        g.drawString("Jeannet: : " + bedrag / 4, 20, y);
        y += 20;
        g.drawString("Brandon: : " + bedrag / 4, 20, y);
        y += 20;
    }
}
