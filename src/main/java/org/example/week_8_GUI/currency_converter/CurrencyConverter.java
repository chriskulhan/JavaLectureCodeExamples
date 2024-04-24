package org.example.week_8_GUI.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame{
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel conversionResultLabel;
    private JPanel mainPanel;

    //vid_2_d
    //make this JComboBox only accept strings by changing this:
//    private JComboBox currencyComboBox;

    //to this:
    private JComboBox<String> currencyComboBox;
    //add field:
//    private double dollarsToEurosExchangeRate = 0.84;// comment this out in vid_2 when I made the EUROS and POUNDS variables
    //$1 = 0.84 Euros

    //vid_2_a. make a hashmap for currencies and their conversion rates:
    //make these final because they aren't going to change:
    //start with making variables:
    private final String EUROS = "Euros";
    private final String POUNDS = "Pounds";

    //make a hashmap for conversion rates: String (name) and double (conversion rate)
    //this will be a Map.of because it's not going to change:
    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.84, POUNDS, 0.75);

    //add constructor:
    CurrencyConverter() {
        setContentPane(mainPanel);

        //changes how big the form is: should be before pack:
        setPreferredSize(new Dimension(400,300));

        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //add enter to click the "Convert" button by adding:
        //getRootPane().setDefaultButton() add "convertButton" to select this button:
        getRootPane().setDefaultButton(convertButton);

        //vid_2_b. add the currencyComboBox:
        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);

        //add action listener: (autocomplete helps)
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //what was typed in the jTextField dollarsTextField?
                //whatever is typed into a JText area is stored a string here in "dollarString":
                String dollarString = dollarsTextField.getText();

                //vid_3 add a try block:
                //if the conversion doesn't work, don't do any of the try block:

                try {
                    //convert to a number,
                    double dollars = Double.parseDouble(dollarString); //todo handle exceptions
                    //adding from vid_3
                    // convert to Euros

//                    String toCurrency = currencyComboBox.getSelectedItem(); //this will be an error by itself
                    //the error listed for the just above^^ line of code is: provided and Object, needs a string
                    //need to force the above string ^^^ (String toCurrency = currencyComboBox.getSelectedItem())
                    // into the type string, or "cast" it. Looks like this:
                    String toCurrency = (String) currencyComboBox.getSelectedItem();
                    //this works because the JComboBox only contains strings (see this line of code way above:
                    //private JComboBox<String> currencyComboBox;)

                    double exchangeRate = exchangeRates.get(toCurrency);

                    //vid_2_b comment this out:
//                    double euros = dollars * dollarsToEurosExchangeRate;

                    //comments in: vid_2_and_3_order_of_operations
                    //convert to target currency: using the above^^^  double euros = dollars * dollarsToEurosExchangeRate;
                    //change to:
                    double convertedValue = dollars * exchangeRate;


//                    //display result in eurosResultLabel
//                    String resultString = String.format("%.2f dollars is equivalent to %.2f Euros.", dollars, euros);

                    //type of exception: (found in the stack trace when the error shows): (when typing a non-number)

                    //add this back in with addition of exchangeRate:
                    String resultString = String.format("%.2f dollars is equivalent to %.2f %s.", dollars,
                            convertedValue, toCurrency);
                    //
                    // vid_2_and_3_order_of_operations, step h:
                    // change this here and in CurrencyConverter.form from:
//                    eurosResultLabel.setText(resultString);
//                    to this:
                    conversionResultLabel.setText(resultString);

                } catch (NumberFormatException nfe) {
                    //tell the user something hasn't work:
                    //to that with a JOptionPain.showMessageDialog();
                    //show messageDialog() has a few arguments:
                    //1. Parent component:  which JFrame is shown in this dialog box? here it's "CurrencyConverter" add ".this"
                    //2. What message do we want to display? Here: ""Please enter a number without any other symbols or characters."
                    JOptionPane.showMessageDialog(CurrencyConverter.this,
                            "Please enter a number without any other symbols or characters." );
                }
            }
        });
    }
}
