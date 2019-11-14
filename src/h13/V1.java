package h13;

import java.awt.*;
import java.applet.*;

public class V1 extends Applet {

    public void init () {

    }

    public void paint (Graphics g) {

        int x1 = 50;
        int x2 = 200;
        int x3= 100;
        int y1 = 200;
        int y2 = 200;
        int y3 = 100;

        tekenDriehoek(g, x1, x2 ,x3 ,y1 ,y2 ,y3);


    }
    void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        // teken een driehoek m.b.v. de meegegeven data (parameters)
        g.drawLine(50, 200, 200, 200);
        g.drawLine(50,200,100,100);
        g.drawLine(200,200,100,100);

    }
}
