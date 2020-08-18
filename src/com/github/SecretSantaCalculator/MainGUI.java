package com.github.SecretSantaCalculator;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

import static java.awt.Color.*;

public class MainGUI {
    public MainGUI() {
        JFrame frame = new JFrame();
        frame.setSize(420, 400);
        JPanel panel = new JPanel();

        Font titleFont = new Font("Calibri", Font.PLAIN, 36);

        panel.setBorder(BorderFactory.createEmptyBorder());
        panel.setLayout(null);



        JLabel mainTitle = new JLabel("Secret Santa");
        mainTitle.setFont(titleFont);
        mainTitle.setBounds((frame.getWidth() / 2) - 95, 20, 190, 40);

        panel.add(mainTitle);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Secret Santa");
        frame.setVisible(true);
    }
}
