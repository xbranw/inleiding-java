package h02;

import java.applet.*;
import java.awt.*;


public class V2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Brandon!", 50, 70);
        g.setColor(Color.red);
        g.drawString("Woolley!", 50, 90);
    }




}
