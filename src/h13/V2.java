package h13;

import java.awt.*;
import java.applet.*;

public class V2 extends Applet {

    public void init () {

    }

    public void paint (Graphics g) {
        int x = 20;
        int y = 20;
        int width = 40;
        int height = 20;

        tekenBaksteenMuur(g,x,y,width,height);

        }
    void tekenBaksteenMuur(Graphics g, int x, int y, int width, int height) {

        for(int i =0; i < 10; i++) {
            x = 20;
            for(int j = 0; j < 20; j++){
                g.setColor(Color.red);
                g.fillRect(x,y,width,height);
                g.setColor(Color.black);
                g.drawRect(x,y,width,height);
                x += width;
            }
            y += height;


        }
    }
}
