package h04;

import java.awt.*;
import java.applet.*;

public class V3 extends Applet{

    public void init() {

    }

    public void paint (Graphics g) {
        g.setColor(Color.red);
        g.drawRect(50, 50, 80, 25);
        g.fillRect(50,50,80, 25);

        g.setColor(Color.white);
        g.drawRect(50, 75, 80, 25);
        g.fillRect(50,75,80,25);

        g.setColor(Color.blue);
        g.drawRect(50,100,80,25 );
        g.fillRect(50,100,80,25);

        g.setColor(Color.black);
        g.drawLine(50, 50, 50,200);

        g.drawRect(50,50,80, 25 );
        g.drawRect(50,75,80,25);
        g.drawRect(50,100,80,25);
    }
}
