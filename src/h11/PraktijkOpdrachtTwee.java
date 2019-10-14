package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrachtTwee extends Applet {

    Button OK;
    TextField tekstvak;
    int tafel;;

    public void init() {

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new OKListener());
        add(tekstvak);

        OK = new Button("OK");
        OK.addActionListener(new OKListener());
        add(OK);

    }

    public void paint(Graphics g) {
        int y = 70;
        for (int i = 1; i < 11; i++) {
                g.drawString("1" + "x" + tafel + "=" + i * tafel, 50, y);
                y += 20;
            }

        }

        class OKListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                tafel++;
                if (tafel >10) {
                    return;
                }

                repaint();
            }
        }
    }
