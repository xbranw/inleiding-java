package h05;

import java.awt.*;
import java.applet.*;

public class V2 extends Applet {

    int gewichtValerie;
    int gewichtHans;
    int gewichtJeroen;
    int hoogteXas;

    public void init() {
        gewichtValerie = 40;
        gewichtHans = 80;
        gewichtJeroen = 100;
        hoogteXas = 150;
    }

    public void paint (Graphics g) {

        // dit zijn de zwarte lijnen
        g.drawLine(50, 50, 50, hoogteXas);
        g.drawLine(50, hoogteXas, hoogteXas, hoogteXas);

        // dit zijn de staafjes
        // Valerie (40 kg)
        g.setColor(Color.yellow);
        g.fillRect(75, hoogteXas-gewichtValerie, 10, gewichtValerie);

        //Hans (80 kg)
        g.setColor(Color.green);
        g.fillRect(100, hoogteXas-gewichtHans, 10, gewichtHans);

        g.setColor(Color.magenta);
        g.fillRect(125, hoogteXas-gewichtJeroen, 10, gewichtJeroen);

        g.setColor(Color.yellow);
        g.drawString("Valerie", 75, 170);

        g.setColor(Color.green);
        g.drawString("Hans", 75, 185);

        g.setColor(Color.magenta);
        g.drawString("Jeroen", 75, 200);

    }
    }