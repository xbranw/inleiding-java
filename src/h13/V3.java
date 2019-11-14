package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V3 extends Applet {

    Button rodeBaksteen;
    Button grijzeBeton;
    boolean aanKnop1;
    boolean aanKnop2;


    public void init () {

        rodeBaksteen = new Button ("Rode Baksteen");
        grijzeBeton = new Button("Grijze Beton");

        rodeBaksteen.addActionListener(new BaksteenListener());
        grijzeBeton.addActionListener(new BetonListener());

        add(rodeBaksteen);
        add(grijzeBeton);

        aanKnop1 = false;
        aanKnop2 = false;

    }

    public void paint (Graphics g) {
        int x = 20;
        int y = 20;
        int width = 40;
        int height = 20;

        if(aanKnop1) {
            tekenBaksteenMuur( g, x, y, width, height);
        }
        if(aanKnop2) {
            tekenBetonMuur(g,x,y,width,height);
        }

    }
    void tekenBetonMuur(Graphics g, int x, int y, int width, int height) {

        for(int i =0; i < 10; i++) {
            x = 20;
            for(int j = 0; j < 20; j++){
                g.setColor(Color.gray);
                g.fillRect(x,y,width,height);
                g.setColor(Color.black);
                g.drawRect(x,y,width,height);
                x += width;
            }
            y += height;
        }
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
    class BetonListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            aanKnop2 = true;
            aanKnop1 = false;
            repaint();

        }
    }

    class BaksteenListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {

            aanKnop1 = true;
            aanKnop2= false;
            repaint();


        }
    }
}
