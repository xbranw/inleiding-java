package h04;

import java.awt.*;
import java.applet.*;

public class V4 extends Applet{

    public void init(){

    }

    public void paint (Graphics g) {
        // dit zijn de zwarte lijnen
        g.drawLine(50,50,50,150);
        g.drawLine(50,150,150,150);

        // dit zijn de staafjes
        g.setColor(Color.yellow);
        g.fillRect(75,130, 10, 20);
        g.drawRect(75,130,10,20);

        g.setColor(Color.green);
        g.fillRect(100,110,10,40);
        g.drawRect(100, 110, 10, 40);

        g.setColor(Color.magenta);
        g.fillRect(125,90,10,60);
        g.drawRect(125,90,10,60);

        g.setColor(Color.yellow);
        g.drawString("Valerie", 75, 170);

        g.setColor(Color.green);
        g.drawString("Hans", 75, 185);

        g.setColor(Color.magenta);
        g.drawString("Jeroen", 75, 200);








    }
}
