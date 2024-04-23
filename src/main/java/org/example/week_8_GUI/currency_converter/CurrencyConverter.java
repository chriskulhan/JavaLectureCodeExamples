package org.example.week_8_GUI.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame{
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel eurosResultLabel;
    private JPanel mainPanel;

    //add field:
    private double dollarsToEurosExchangeRate = 0.84;
    //$1 = 0.84 Euros

    //add constructor:
    CurrencyConverter() {
        setContentPane(mainPanel);

        //changes how big the form is: should be before pack:
        setPreferredSize(new Dimension(400,300));

        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //add action listener: (autocomplete helps)
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //what was typed in the jTextField dollarsTextField?
                //whatever is typed into a JText area is a string:
                String dollarString = dollarsTextField.getText();

                //convert to a number,
                double dollars = Double.parseDouble(dollarString); //todo handle exceptions

                // convert to Euros
                double euros = dollars * dollarsToEurosExchangeRate;

                //display result in eurosResultLabel
                String resultString = String.format("%.2f dollars is equivalent to %.2f Euros.", dollars, euros);
                eurosResultLabel.setText(resultString);

            }
        });
    }
}
