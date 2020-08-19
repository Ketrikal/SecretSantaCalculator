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
        MainGUI.mpButton.removeActionListener(MainGUI.buttonAddName);
        MainGUI.mpButton.addActionListener(new QueryPartners());
    }
}

class QueryPartners implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(Main.mainSystem.getRecipient(MainGUI.textBox.getText()));
    }
}

class Exit implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}