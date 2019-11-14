package h13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int x = 50;
        int y = 50;
        int width = 50;
        int length = 50;

        tekenBoom(g, x, y, width, length);
    }

    void tekenBoom(Graphics g, int x, int y, int width, int length) {
        g.setColor(Color.green);
        g.fillOval(x, y, width, length);
        x += 5;
        y += 50;
        width -= 20;
        g.setColor(Color.gray);
        g.fillRect(x, y, width, length);
    }
}
