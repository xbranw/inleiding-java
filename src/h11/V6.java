package h11;

import java.awt.*;
import java.applet.*;

public class V6 extends Applet {

    public void ini() {

    }

    public void paint(Graphics g) {
        int teller = 0;

        int x = 100;
        int y = 100;

        int breedte = 10;
        int lengte = 10;

        while (teller < 5) {
            y -=10;
            x -=10;
            breedte += 20;
            lengte += 20;

            g.drawOval(x, y, breedte, lengte);
            teller++;
        }
    }
}
