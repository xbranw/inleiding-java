package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V5 extends Applet {

    Button OK;
    Button gemiddelde;
    TextField tekstvak;
    TextField tekstvak2;
    TextField tekstvak3;
    String message;
    String message2;
    double userInput;
    double totaal;

    public void init() {
    tekstvak = new TextField(4);
        add(tekstvak);

        tekstvak2 = new TextField(4);
        add(tekstvak2);

        tekstvak3 = new TextField(4);
        add(tekstvak3);

        OK = new Button ("OK");
        OK.addActionListener(new OKListener());
        add(OK);

        gemiddelde = new Button ("Toon gemiddelde");
        gemiddelde.addActionListener(new ToonListener());
        add(gemiddelde);
        message2="";
        message ="";
    }

    public void paint (Graphics g) {
    g.drawString(message,50,70);
    g.drawString(String.valueOf(totaal), 50,90);
    }

    class ToonListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s = tekstvak.getText();
            userInput = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            double inputTwo = Double.parseDouble(s2);
            String s3 = tekstvak3.getText();
            double inputThree = Double.parseDouble(s3);
            totaal = (userInput + inputTwo + inputThree) / 3;
            if (totaal > 5.4) {
                message = "Het gemiddelde is:" + totaal + " De leerling is geslaagd";
                repaint();}

                else {
                    message = "Het gemiddelde is:" + totaal + " De leerling is niet geslaagd";
                }
        }

    }

    class OKListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
        String s = tekstvak.getText();
        userInput = Double.parseDouble(s);
        if (userInput > 5.4) {
            message="Het cijfer "  + userInput + " is: voldoende";
            repaint();}
            else {
                message="Het cijfer "  + userInput + " is: onvoldoende";
                repaint();
            }
            if (userInput > 10) {
                message = "Voer een getal onder de 10";
                repaint();
            }
        }
        }
    }
