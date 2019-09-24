package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V1 extends Applet {

    Button Enter;
    TextField tekstvak;
    int hoogsteGetal;
    int laagsteGetal;
    int userInput;
    boolean eersteGetal;
    String message;

    public void init() {
        tekstvak = new TextField(20);
        add(tekstvak);
        hoogsteGetal = 0;
        laagsteGetal = 0;
        eersteGetal = true;
        Enter = new Button("Enter");
        Enter.addActionListener(new EnterListener());
        add(Enter);
        message = "";
    }

    public void paint(Graphics g) {
        g.drawString("Hoogste getal is:" + hoogsteGetal, 50, 100);
    }

    class EnterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            userInput = Integer.parseInt(s);
            if (eersteGetal) {
                eersteGetal = false;
                hoogsteGetal = userInput;
                laagsteGetal = userInput;
                repaint();
            } else {
                if (userInput > hoogsteGetal) {
                    hoogsteGetal = userInput;
                    message = "";
                    repaint();
                }
            }
        }
    }
}



