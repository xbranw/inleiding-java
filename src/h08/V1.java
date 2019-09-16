package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V1 extends Applet {

    TextField tekstvak;
    Button knopOK;
    Button knopReset;
    String message;

    public void init() {

            setSize(400,400);
            tekstvak = new TextField(20);
            add(tekstvak);

            knopOK = new Button("OK");
            knopOK.addActionListener(new KnopOKListener());
            add(knopOK);

            knopReset = new Button("Reset");
            knopReset.addActionListener(new KnopResetListener());
            add(knopReset);

            message =" Type iets???";
    }

    public void paint(Graphics g) {
        g.drawString(message,20,150 );
    }

        class KnopOKListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
               message = tekstvak.getText();
               repaint();
            }
        }
        class KnopResetListener implements ActionListener {
            public void actionPerformed(ActionEvent e){
                System.out.println("De Reset-Knop werkt!");
                tekstvak.setText(" ");

            }
    }



    }