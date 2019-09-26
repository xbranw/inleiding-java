package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V3 extends Applet {

    TextField tekstvak;
    Button OK;
    String message;
    int userInput;
    boolean firstInput;

    public void init() {

        tekstvak = new TextField(20);
        add(tekstvak);
        OK = new Button ("OK");
        OK.addActionListener(new OKListener());
        add(OK);
        message ="";
    }

    public void paint (Graphics g) {
    g.drawString(message, 50,70);
    }

    class OKListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
        String s = tekstvak.getText();
        userInput = Integer.parseInt(s);
        if (userInput == 1) {
        message ="Januari: 31 dagen ";
        repaint();
        }
        else {
            if (userInput == 2) {
                message = "Februari: 28 dagen";
                repaint();
            }
             if (userInput ==3) {
                 message ="Maart: 31 dagen";
                 repaint();
            }
             if (userInput ==4) {
                 message ="April: 30 dagen";
                 repaint();
             }
             if (userInput ==5) {
                 message ="Mei: 31 dagen";
                 repaint();
             }
             if (userInput ==6) {
                 message ="Juni: 30 dagen";
                 repaint();
             }
             if (userInput ==7) {
                 message ="Juli: 31 dagen";
                 repaint();
             }
             if (userInput ==8) {
                 message ="Augustus: 31 dagen";
                 repaint();
             }
             if (userInput ==9) {
                 message ="September: 30 dagen";
                 repaint();
             }
             if (userInput ==10) {
                 message ="Oktober: 31 dagen";
                 repaint();
             }
             if (userInput ==11) {
                 message ="November: 30 dagen";
                 repaint();
             }
             if (userInput ==12) {
                 message ="December: 31 dagen";
                 repaint();
             }
             if (userInput > 12) {
                 message ="DAT BESTAAT NIET PIK";
                 repaint();
             }
        }
        }
    }
}
