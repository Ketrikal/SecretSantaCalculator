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

        JTextField textBox = new JTextField();
        textBox.setBounds(mainTitle.getX(), mainTitle.getY() + 60, 190, 25);

        JButton mpButton = new JButton("Add");
        mpButton.setBounds(textBox.getX() + ((textBox.getWidth() - 60) / 2), textBox.getY() + 30, 60, 25);

        JButton calcButton = new JButton("Calculate");
        calcButton.setBounds(mpButton.getX() + ((mpButton.getWidth() - 90) / 2), mpButton.getY() + 30, 90, 25);


        panel.add(mainTitle);
        panel.add(textBox);
        panel.add(mpButton);
        panel.add(calcButton);


        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Secret Santa");
        frame.setVisible(true);
    }
}
