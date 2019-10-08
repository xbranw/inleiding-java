package h11;

import java.awt.*;
import java.applet.*;

public class V5 extends Applet {

    public void ini() {

    }

    public void paint(Graphics g) {
        int teller = 0;
        int x = 50;
        int y = 50;

        while (teller < 5){
            y += 50;
            x += 50;
            g.drawRect(x, y, 50, 50);
            teller++;
        }
    }
}
