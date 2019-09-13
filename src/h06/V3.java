package h06;

import java.awt.*;
import java.applet.*;

public class V3 extends Applet {

    int getal1;

    public void init(){

         getal1 = 2147483647;
         getal1++;
    }

    public void paint (Graphics g) {
        g.drawString(""+ (getal1),50, 70);

    }



}
