package h04;

import java.awt.*;
import java.applet.*;

public class V2 extends Applet {

    public void init() {

    }

    public void paint (Graphics g) {
        g.setColor(Color.red);
        g.drawRect(100, 100, 200, 200);
        g.drawLine(175, 300,175, 260);
        g.drawLine(200, 300, 200, 260);
        g.drawLine(175, 260, 200, 260 );
        g.drawRect(125, 125, 100, 100);
        g.drawString("Telt dit als een huis?", 125, 123 );
    }








}
