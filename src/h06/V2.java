package h06;

import java.awt.*;
import java.applet.*;

public class V2 extends Applet {

    int seconde;

    public void init() {

        seconde = 60;


    }

        public void paint (Graphics g) {
        int y = 20;
            g.drawString("In een uur zitten" + seconde * seconde + "seconden", 20 , y );
            y += 20;
            g.drawString("In een dag zitten" + seconde * seconde * 24 + "seconden" ,20 , y );
            y += 20;
            g.drawString("In een jaar zitten" + seconde * seconde * 24 * 365 + "seconden", 20 , y );
            y += 20;






        }
}
