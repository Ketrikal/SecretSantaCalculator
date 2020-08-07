package com.github.SecretSantaCalculator;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

import static java.awt.Color.*;

public class MainGUI {
    public MainGUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel mainTitle = new JLabel("Secret Santa");

        panel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, black, blue));
        panel.setLayout(new GridLayout());

        frame.add(panel, BorderLayout.CENTER);
        frame.add(mainTitle);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Secret Santa");
        frame.pack();
        frame.setVisible(true);
    }
}
