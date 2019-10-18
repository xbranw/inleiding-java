package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class V3 extends Applet {

    TextField[] tekstvak;
    Button OK;

    public void init() {


        tekstvak = new TextField[5];
        for(int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField(20);
            add(tekstvak[i]);
        }

        OK = new Button("OK");
        OK.addActionListener(new OKListener());
        add(OK);


    }

    public void paint (Graphics g) {

    }

    class OKListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {

            int[] getal = new int[5];

            for(int i = 0; i < tekstvak.length; i++) {
                String k = tekstvak[i].getText();
                int input = Integer.parseInt(k);
                getal[i] = input;
            }

            Arrays.sort(getal);
            for(int i = 0; i < tekstvak.length; i++) {
                tekstvak[i].setText(""+getal[i]);
            }

            repaint();

        }
    }
}
