package com.jano;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class TheWindow extends JFrame {

    private JSlider slider;
    private DrawOval myPanel;

    public TheWindow() {
        super("OvalSlider by Jano");
        myPanel = new DrawOval();
        myPanel.setBackground(Color.ORANGE);

        slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 0);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);

        slider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        myPanel.setD(slider.getValue());
                    }
                }
        );

        add(slider, BorderLayout.SOUTH);
        add(myPanel, BorderLayout.CENTER);

    }
}
