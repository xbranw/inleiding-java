package h04;

import java.awt.*;
import java.applet.*;

public class V5 extends Applet{

    public void init(){
        setBackground(Color.BLUE);

    }

    public void paint (Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(150,150,100,50,0,360);
        g.drawArc(150, 150,100, 50, 0, 360);





    }
}
