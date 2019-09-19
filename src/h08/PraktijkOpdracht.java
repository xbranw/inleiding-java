package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {

    TextField tekstvak;
    TextField tekstvak2;
    Button keer;
    Button deel;
    Button plus;
    Button min;
    double antwoord;


    public void init() {

        tekstvak = new TextField(20);
        add(tekstvak);
        tekstvak2 = new TextField(20);
        add(tekstvak2);
        // KEER ***
        keer = new Button("*");
        keer.addActionListener(new KeerKnopListener());
        add(keer);
        // DEEL ////
        deel = new Button("/");
        deel.addActionListener(new DeelKnopListener());
        add(deel);
        // PLUS +++
        plus = new Button("+");
        plus.addActionListener(new PlusKnopListener());
        add(plus);
        // MIN ----
        min = new Button("-");
        min.addActionListener(new MinKnopListener());
        add(min);


    }

    public void paint (Graphics g) {
    g.drawString("Antwoord = " + antwoord, 50,70);

    }

    class KeerKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        String k = tekstvak.getText();
        double input = Double.parseDouble(k);
       String k2 = tekstvak2.getText();
       double input2 = Double.parseDouble(k2);
       antwoord = input * input2;
             tekstvak2.setText("");
            tekstvak.setText(" " + antwoord);
       repaint();
        }

    }
    class DeelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        String k = tekstvak.getText();
        double input = Double.parseDouble(k);
        String k2 = tekstvak2.getText();
        double input2 = Double.parseDouble(k2);
        antwoord = input / input2;
            tekstvak2.setText("");
            tekstvak.setText(" " + antwoord);
        repaint();
        }

    }
    class PlusKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        String k = tekstvak.getText();
        double input = Double.parseDouble(k);
        String k2 = tekstvak2.getText();
        double input2 = Double.parseDouble(k2);
        antwoord = input + input2;
            tekstvak2.setText("");
            tekstvak.setText(" " + antwoord);
        repaint();
        }

    }
    class MinKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        String k = tekstvak.getText();
        double input = Double.parseDouble(k);
        String k2 = tekstvak2.getText();
        double input2 = Double.parseDouble(k2);
        antwoord = input - input2;
            tekstvak2.setText("");
            tekstvak.setText(" " + antwoord);
        repaint();
        }

    }
}
