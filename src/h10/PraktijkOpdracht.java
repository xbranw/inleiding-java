package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {


    Button OK;
    TextField tekstvak;
    String message;
    int cijfer;

    public void init() {

        tekstvak = new TextField(4);
        add(tekstvak);

        OK = new Button("OK");
        OK.addActionListener(new OKListener());
        add(OK);

        message = "";
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 70);
    }

    class OKListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            switch(cijfer){
                case 1:
                    message = "Het cijfer is slecht";
                    break;
                case 2:
                    message = "Het cijfer is slecht";
                    break;
                case 3:
                    message = "Het cijfer is slecht";
                    break;
                case 4:
                    message = "Het cijfer is onvoldoende";
                    break;
                case 5:
                    message = "Het cijfer is matig";
                    break;
                case 6:
                    message = "Het cijfer is voldoende";
                    break;
                case 7:
                    message = "Het cijfer is voldoende";
                    break;
                case 8:
                    message = "Het cijfer is goed";
                    break;
                case 9:
                    message = "Het cijfer is goed";
                    break;
                case 10:
                    message = "Het cijfer is goed";
                    break;
                default:
                    message = "U hebt een verkeerd nummer ingetikt..!";
                    break;
            }
            repaint();
            }
            }
        }