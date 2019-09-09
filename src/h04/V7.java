package h04;

import java.awt.*;
import java.applet.*;

public class V7 extends Applet {

    public void init() {

    }

    public void paint (Graphics g) {
        g.drawRoundRect(100,100,100,100,10,10);
        g.fillArc(110,110,30,30,0,360);
        g.fillArc(110,165,30,30,0,360);
        g.fillArc(155,110,30,30,0,360);
        g.fillArc(155,165,30,30,0,360);
    }
}
