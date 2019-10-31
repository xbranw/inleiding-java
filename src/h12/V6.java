package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V6 extends Applet {

    Button OK;
    TextField tekstvak;
    boolean gevonden;
    int aantal;
    int[] getal = {2, 10, 10, 12, 5, 19, 21, 5, 5};

    public void init() {

        gevonden = false;

        tekstvak = new TextField(10);
        add(tekstvak);

        OK = new Button("OK");
        OK.addActionListener(new OKListener());
        add(OK);

    }

    public void paint(Graphics g) {

        if (gevonden == true) {
            g.drawString("De waarde is" +  aantal + "x gevonden", 50, 70);
        } else {
            g.drawString("De waarde is niet gevonden", 50, 70);
        }
    }

    class OKListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantal = 0;
            gevonden = false;
            String k = tekstvak.getText();
            int input = Integer.parseInt(k);

            for (int i = 0; i < getal.length; i++) {
                if (getal[i] == input) {
                    gevonden = true;
                    aantal++;
                }

            }
            repaint();

        }
    }
}
