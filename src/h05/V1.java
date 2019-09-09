package h05;

import java.awt.*;
import java.applet.*;

public class V1 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
    setSize(500,500);
    opvulkleur = Color.magenta;
    lijnkleur = Color.black;
    breedte = 150;
    hoogte = 100;
    }

    public void paint (Graphics g) {
        g.drawLine(100,100,250,100);
        g.drawString("Lijn", 140,115);
        g.drawRect(100,150,breedte,hoogte);
        g.drawString("Rechthoek", 140,265);
        g.setColor(opvulkleur);
        g.fillRect(260,150,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(260,150,breedte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal", 260, 265);
        g.drawOval(420,150,breedte,hoogte);
        g.drawString("Taartpunt met ovaal eromheen", 430,265);
        g.setColor(opvulkleur);
        g.fillArc(420,150,breedte,hoogte, 0,45);

        g.setColor(lijnkleur);
        g.drawString("Afgeronde rechthoek", 135,400);
        g.drawString("Gevulde ovaal", 290,400);
        g.drawString("Cirkel", 480,400);
        g.drawOval(450,280,100,100);
        g.drawRoundRect(100,280,breedte,hoogte,30,30);
        g.setColor(opvulkleur);
        g.fillOval(260,280,breedte,hoogte);





    }







}


