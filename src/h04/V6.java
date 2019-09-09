package h04;

import java.awt.*;
import java.applet.*;

public class V6 extends Applet {

    public void init() {

    }

    public void paint (Graphics g) {
        g.setColor(Color.black);
        g.fillRect(145,250,10,100);
        g.fillRect(100,100,100,150);
        g.setColor(Color.red);
        g.fillArc(100,100,100,50,0,360);
        g.setColor(Color.yellow);
        g.fillArc(100, 150, 100,50, 0, 360);
        g.setColor(Color.green);
        g.fillArc(100,200,100,50,0,360);


    }




}
