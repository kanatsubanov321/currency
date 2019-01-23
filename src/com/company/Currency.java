package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Currency extends JFrame {
    Currency() {
        super("Exchange Currency");
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBounds(0, 0, 500, 500);

        JLabel jLabel = new JLabel("Sell: ");
        jLabel.setBounds(30, 10, 50, 20);

        JRadioButton usd = new JRadioButton("USD");
        JRadioButton eur = new JRadioButton("EUR");
        JRadioButton rub = new JRadioButton("RUB");
        JRadioButton kzt = new JRadioButton("KZT");
        usd.setBounds(10, 30, 200, 20);
        eur.setBounds(10, 50, 200, 20);
        rub.setBounds(10, 70, 200, 20);
        kzt.setBounds(10, 90, 200, 20);

        ButtonGroup group = new ButtonGroup();
        group.add(usd);
        group.add(eur);
        group.add(rub);
        group.add(kzt);

        JLabel jLabel1 = new JLabel("sum: ");
        jLabel1.setBounds(50, 110, 50, 20);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(10, 130, 100, 20);

        JButton jButton = new JButton("Calculate");
        jButton.setBounds(10, 160, 100, 20);

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(10, 190, 100, 20);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                if (usd.isSelected()) {
                    i = 1;
                } else if (eur.isSelected()) {
                    i = 2;
                } else if (rub.isSelected()) {
                    i = 3;
                } else if (kzt.isSelected()) {
                    i = 4;
                } else i = 0;
                try {
                    String sum = "";
                    double som = Integer.parseInt(jTextField.getText());
                    if (i == 1) {
                        sum = String.valueOf(som * 69);
                        jTextArea.setText(sum);
                    } else if (i == 2) {
                        sum = String.valueOf(som * 79);
                        jTextArea.setText(sum);
                    } else if (i == 3) {
                        sum = String.valueOf(som * 1.1);
                        jTextArea.setText(sum);
                    } else {
                        sum = String.valueOf(som * 0.20);
                        jTextArea.setText(sum);
                    }
                } catch (Exception ex) {
                    jTextArea.setText("Error");
                }
            }
        });

        jPanel.add(jLabel);
        jPanel.add(usd);
        jPanel.add(eur);
        jPanel.add(rub);
        jPanel.add(kzt);
        jPanel.add(jLabel1);
        jPanel.add(jTextField);
        jPanel.add(jButton);
        jPanel.add(jTextArea);

        JLabel jLabel3 = new JLabel("Buy: ");
        jLabel3.setBounds(280, 10, 50, 20);

        JRadioButton usd1 = new JRadioButton("USD");
        JRadioButton eur1 = new JRadioButton("EUR");
        JRadioButton rub1 = new JRadioButton("RUB");
        JRadioButton kzt1 = new JRadioButton("KZT");
        usd1.setBounds(260, 30, 200, 20);
        eur1.setBounds(260, 50, 200, 20);
        rub1.setBounds(260, 70, 200, 20);
        kzt1.setBounds(260, 90, 200, 20);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(usd1);
        group1.add(eur1);
        group1.add(rub1);
        group1.add(kzt1);

        JLabel jLabel2 = new JLabel("sum: ");
        jLabel2.setBounds(300, 110, 50, 20);

        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(260, 130, 100, 20);

        JButton jButton1 = new JButton("Calculate");
        jButton1.setBounds(260, 160, 100, 20);

        JTextArea jTextArea1 = new JTextArea();
        jTextArea1.setBounds(260, 190, 100, 20);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                if (usd1.isSelected()) {
                    i = 1;
                } else if (eur1.isSelected()) {
                    i = 2;
                } else if (rub1.isSelected()) {
                    i = 3;
                } else if (kzt1.isSelected()) {
                    i = 4;
                } else i = 0;
                try {
                    String sum = "";
                    double som = Integer.parseInt(jTextField1.getText());
                    if (i == 1) {
                        sum = String.valueOf(som / 68);
                        jTextArea1.setText(sum);
                    } else if (i == 2) {
                        sum = String.valueOf(som / 78);
                        jTextArea1.setText(sum);
                    } else if (i == 3) {
                        sum = String.valueOf(som / 0.9);
                        jTextArea1.setText(sum);
                    } else {
                        sum = String.valueOf(som / 0.18);
                        jTextArea1.setText(sum);
                    }
                } catch (Exception ex) {
                    jTextArea1.setText("Error");
                }
            }
        });

        jPanel.add(jLabel3);
        jPanel.add(usd1);
        jPanel.add(eur1);
        jPanel.add(rub1);
        jPanel.add(kzt1);
        jPanel.add(jLabel2);
        jPanel.add(jTextField1);
        jPanel.add(jButton1);
        jPanel.add(jTextArea1);

        this.add(jPanel);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setBounds(400, 100, 400, 300);
        this.setResizable(false);
        setLayout(null);
    }
}

