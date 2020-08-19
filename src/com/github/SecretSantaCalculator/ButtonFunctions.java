package com.github.SecretSantaCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AddName implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.mainSystem.addName(MainGUI.textBox.getText());
        MainGUI.textBox.setText("");
        System.out.println(Main.mainSystem.showNameList());
    }
}

class CalculatePartners implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.mainSystem = Main.mainSystem.calculatePartners();
        System.out.println(Main.mainSystem.showPartnerData());
        MainGUI.mpButton.setText("Query");
    }
}