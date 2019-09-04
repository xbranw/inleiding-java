package h02;

import java.applet.*;
import java.awt.*;


public class V1 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Brandon!", 50, 70);
    }


}
