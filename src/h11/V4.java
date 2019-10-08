package h11;

import java.awt.*;
import java.applet.*;

public class V4 extends Applet {

    public void ini() {

    }

    public void paint (Graphics g) {
        int x = 50;
        int y = 70;

        for (int i = 1; i < 11; i++) {
            g.drawString("Nummer " + i * 3   ,x,y);
            y += 20;
        }
    }

    }