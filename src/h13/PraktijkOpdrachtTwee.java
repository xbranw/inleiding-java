package h13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdrachtTwee extends Applet {

    public void init() {
        int x = 50;
        int y = 50;
        int width = 50;
        int length = 50;
    }

    public void paint(Graphics g) {

        int x = 50;
        int y = 50;
        int width = 50;
        int length = 50;


        tekenBoom(g, x, y, width, length);
        tekenBoom2(g,x, y, width, length);
        tekenBoom3(g,x,y,width,length);
        tekenBoom4(g,x,y,width,length);
        tekenBoom5(g,x,y,width,length);

        tekenBoom6(g,x,y,width,length);
        tekenBoom7(g,x,y,width,length);
        tekenBoom8(g, x, y, width, length);
        tekenBoom9(g, x, y, width, length);
        tekenBoom10(g, x, y, width, length);
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
    void tekenBoom2(Graphics g, int x, int y, int width, int length) {
        g.setColor(Color.green);
        x += 100;
        g.fillOval(x, y, width, length);
        x += 5;
        y += 50;
        width -= 20;
        g.setColor(Color.gray);
        g.fillRect(x, y, width, length);
    }
    void tekenBoom3(Graphics g, int x, int y, int width, int length) {
        g.setColor(Color.green);
        x += 200;
        g.fillOval(x, y, width, length);
        x += 5;
        y += 50;
        width -= 20;
        g.setColor(Color.gray);
        g.fillRect(x, y, width, length);
    }
    void tekenBoom4(Graphics g, int x, int y, int width, int length) {
        g.setColor(Color.green);
        x += 300;
        g.fillOval(x, y, width, length);
        x += 5;
        y += 50;
        width -= 20;
        g.setColor(Color.gray);
        g.fillRect(x, y, width, length);
    }
    void tekenBoom5(Graphics g, int x, int y, int width, int length) {
        g.setColor(Color.green);
        x += 400;
        g.fillOval(x, y, width, length);
        x += 5;
        y += 50;
        width -= 20;
        g.setColor(Color.gray);
        g.fillRect(x, y, width, length);
    }
    void tekenBoom6(Graphics g, int x, int y, int width, int length) {
        g.setColor(Color.green);
        y += 150;
        g.fillOval(x, y, width, length);
        x += 5;
        y += 50;
        width -= 20;
        g.setColor(Color.gray);
        g.fillRect(x, y, width, length);
    }
    void tekenBoom7(Graphics g, int x, int y, int width, int length) {
        g.setColor(Color.green);
        y += 150;
        x += 100;
        g.fillOval(x, y, width, length);
        x += 5;
        y += 50;
        width -= 20;
        g.setColor(Color.gray);
        g.fillRect(x, y, width, length);
    }
    void tekenBoom8(Graphics g, int x, int y, int width, int length) {
        g.setColor(Color.green);
        y += 150;
        x += 200;
        g.fillOval(x, y, width, length);
        x += 5;
        y += 50;
        width -= 20;
        g.setColor(Color.gray);
        g.fillRect(x, y, width, length);
    }
    void tekenBoom9(Graphics g, int x, int y, int width, int length) {
        g.setColor(Color.green);
        y += 150;
        x += 300;
        g.fillOval(x, y, width, length);
        x += 5;
        y += 50;
        width -= 20;
        g.setColor(Color.gray);
        g.fillRect(x, y, width, length);
    }
    void tekenBoom10(Graphics g, int x, int y, int width, int length) {
        g.setColor(Color.green);
        y += 150;
        x += 400;
        g.fillOval(x, y, width, length);
        x += 5;
        y += 50;
        width -= 20;
        g.setColor(Color.gray);
        g.fillRect(x, y, width, length);
    }
}


