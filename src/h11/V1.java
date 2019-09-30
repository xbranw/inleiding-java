package h11;

import java.awt.*;
import java.applet.*;

public class V1 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int x = 1;

        for(teller = 1; teller < 11; teller++) {
            x += 20;
            g.drawLine(x , 50, x, 200 );
            g.drawString("" + teller, x, 210 );
        }
        }
    }

