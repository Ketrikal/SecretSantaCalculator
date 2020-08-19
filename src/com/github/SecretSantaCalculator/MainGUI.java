package com.github.SecretSantaCalculator;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

import static java.awt.Color.*;

public class MainGUI {

    public static AddName buttonAddName = new AddName();
    public static CalculatePartners buttonCalculatePartners = new CalculatePartners();
    public static QueryPartners buttonQuery = new QueryPartners();
    public static Exit buttonExit = new Exit();

    public static JTextField textBox;
    public static JButton mpButton;
    public static JButton calcButton;

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

        textBox = new JTextField();
        textBox.setBounds(mainTitle.getX(), mainTitle.getY() + 60, 190, 25);

        mpButton = new JButton("Add");
        mpButton.setBounds(textBox.getX() + ((textBox.getWidth() - 90) / 2), textBox.getY() + 45, 90, 25);
        mpButton.addActionListener(buttonAddName);

        calcButton = new JButton("Calculate");
        calcButton.setBounds(mpButton.getX(), mpButton.getY() + 30, 90, 25);
        calcButton.addActionListener(buttonCalculatePartners);

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
