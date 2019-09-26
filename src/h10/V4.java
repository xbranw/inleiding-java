package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V4 extends Applet {

    TextField tekstvak;
    Button OK;
    String message;
    String message2;
    int userInput;
    int jaartal;

    public void init() {

        tekstvak = new TextField(20);
        add(tekstvak);
        OK = new Button("OK");
        OK.addActionListener(new OKListener());
        add(OK);
        message = "";
        message2="";
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 70);
        g.drawString(message2, 50,90);
    }

    class OKListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            userInput = Integer.parseInt(s);
            if (userInput == 1) {
                message = "Januari: 31 dagen ";
                repaint();
            } else {
                if (userInput == 2) {
                    message = "Februari: 28 dagen";
                    repaint();
                }
                if (userInput == 3) {
                    message = "Maart: 31 dagen";
                    repaint();
                }
                if (userInput == 4) {
                    message = "April: 30 dagen";
                    repaint();
                }
                if (userInput == 5) {
                    message = "Mei: 31 dagen";
                    repaint();
                }
                if (userInput == 6) {
                    message = "Juni: 30 dagen";
                    repaint();
                }
                if (userInput == 7) {
                    message = "Juli: 31 dagen";
                    repaint();
                }
                if (userInput == 8) {
                    message = "Augustus: 31 dagen";
                    repaint();
                }
                if (userInput == 9) {
                    message = "September: 30 dagen";
                    repaint();
                }
                if (userInput == 10) {
                    message = "Oktober: 31 dagen";
                    repaint();
                }
                if (userInput == 11) {
                    message = "November: 30 dagen";
                    repaint();
                }
                if (userInput == 12) {
                    message = "December: 31 dagen";
                    repaint();
                }
                if (userInput > 12) {
                    message = "";
                    repaint();
                }
            }
            jaartal = Integer.parseInt(s);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) { message2 = ""+ jaartal + " is een schrikkeljaar, in dit jaar heeft februari 30 dagen";
            }
            else { message2 = ""+ jaartal + " is geen schrikkeljaar"; }
        }
    }
}
