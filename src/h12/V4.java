package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class V4 extends Applet {

    Button OK;
    TextField tekstvak;
    boolean eersteGetal;
    boolean isGeklikt;
    int index;
    int[] getal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    public void init() {

        tekstvak = new TextField(20);
        add(tekstvak);

        OK = new Button("OK");
        OK.addActionListener(new OKListener());
        add(OK);

        eersteGetal = false;

    }


    public void paint(Graphics g) {
        if (isGeklikt) {
            if (eersteGetal) {
                g.drawString("De waarde is gevonden op " + index, 50, 70);
            } else {
                g.drawString("De waarde is niet gevonden", 50, 70);
            }

        }
    }
        class OKListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {

                eersteGetal = false;
                String k = tekstvak.getText();
                int input = Integer.parseInt(k);
                isGeklikt = true;

                for (int i = 0; i < getal.length; i++) {
                    if (getal[i] == input) {
                        eersteGetal = true;
                        index = i;
                    }
                }
                repaint();


            }
        }
    }



