package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;

public class V1 extends Applet {
    double salaris[] = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
    double optelsom;
    double gemiddlde;


    public void init() {


        for(int i = 0; i < salaris.length; i++) {
            optelsom = optelsom + salaris[i];
        }
        gemiddlde = optelsom / salaris.length;
        }



    public void paint(Graphics g) {

        for (int i = 0; i < salaris.length; i++) {
            g.drawString("Getal: " + salaris[i] , 50, 20 * i + 20);
            g.drawString("Het gemiddelde: "+ gemiddlde,50,220);
        }
    }
}