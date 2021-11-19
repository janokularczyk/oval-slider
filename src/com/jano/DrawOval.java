package com.jano;

import java.awt.*;
import javax.swing.*;


public class DrawOval extends JPanel {

    private int d = 0;

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.fillOval(10, 10, d, d);
    }

    public void setD(int newD) {
        d = (newD >= 0 ? newD : 10);  // compressed if statement
        repaint();
    }
    // build-in layout method
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }
    // build-in layout method
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }
}
