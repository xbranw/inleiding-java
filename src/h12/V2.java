package h12;

import java.applet.*;
import java.awt.*;
import java.util.*;

    public class V2 extends Applet {

        Button[] OK;

        public void init() {
            OK = new Button[25];
            for (int i = 0; i < OK.length; i++) {
                OK[i] = new Button("OK");
            }

            for (int i = 0; i < OK.length; i++) {
                add(OK[i]);

            }
        }

        public void paint(Graphics g) {

        }
    }
