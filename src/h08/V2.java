package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V2 extends Applet{

    Button manButton;
    Button vrouwButton;
    Button jongenButton;
    Button meisjesButton;
    int aantalMeisjes;
    int aantalJongens;
    int aantalMannen;
    int aantalVrouwen;
    int totaalPersonen;

    public void init() {
        manButton = new Button ("Mannen");
        manButton.addActionListener(new ManKnopListener());
        add(manButton);

        vrouwButton = new Button ("Vrouwen");
        vrouwButton.addActionListener(new VrouwKnopListener());
        add(vrouwButton);

        jongenButton = new Button ("Jongens");
        jongenButton.addActionListener(new JongenKnopListener());
        add(jongenButton);

        meisjesButton = new Button ("Meisjes");
        meisjesButton.addActionListener(new MeisjeKnopListener());
        add(meisjesButton);

    }

    public void paint (Graphics g){
       int y = 20;
        g.drawString("Aantal mannen:" + aantalMannen, 50, 70);
        y += 20;
        g.drawString("Aantal vrouwen:" + aantalVrouwen, 50, y);
        y += 20;
        g.drawString("Aantal jongeren:" + aantalJongens, 50, y);
        y += 20;
        g.drawString("Aantal meisjes:" + aantalMeisjes, 50,y);
        y += 20;
        g.drawString("Totaal:" + totaalPersonen,  50,y);
    }

    class ManKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
       aantalMannen++;
       totaalPersonen++;;
       repaint();
        }
    }
    class VrouwKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantalVrouwen++;
            totaalPersonen++;
            repaint();
        }
    }
    class JongenKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantalJongens++;
            totaalPersonen++;
            repaint();
        }
    }
    class MeisjeKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantalMeisjes++;
            totaalPersonen++;
            repaint();
        }
    }


}