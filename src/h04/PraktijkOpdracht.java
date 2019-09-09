package h04;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {

    public void init() {

    }

    public void paint (Graphics g) {
        g.drawLine(100,100,250,100);
        g.drawString("Lijn", 140,115);
        g.drawRect(100,150,150,100);
        g.drawString("Rechthoek", 140,265);
        g.setColor(Color.magenta);
        g.fillRect(260,150,150,100);
        g.setColor(Color.black);
        g.drawOval(260,150,150,100);
        g.drawString("Gevulde rechthoek met ovaal", 260, 265);
        g.drawOval(420,150,150,100);
        g.drawString("Taartpunt met ovaal eromheen", 430,265);
        g.setColor(Color.magenta);
        g.fillArc(420,150,150,100, 0,45);

        g.setColor(Color.black);
        g.drawString("Afgeronde rechthoek", 135,400);
        g.drawString("Gevulde ovaal", 290,400);
        g.drawString("Cirkel", 480,400);
        g.drawOval(450,280,100,100);
        g.drawRoundRect(100,280,150,100,30,30);
        g.setColor(Color.magenta);
        g.fillOval(260,280,150,100);





    }







}
