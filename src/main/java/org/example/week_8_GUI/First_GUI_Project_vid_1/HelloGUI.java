package org.example.week_8_GUI.First_GUI_Project_vid_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//1. tell HelloGUI it's a jFrame. add "extends JFrame" below:
public class HelloGUI extends JFrame{
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JTextField myFirstLabel;

    //2. add constructor: This HelloGUI object will be created
    HelloGUI() {
        //3. set ContentPane (mainPanel)
            //--telling the JFrame window that the main component is
            //  the jPanel called mainPanel
        setContentPane(mainPanel);

        //10. set the size of the box that's created:
            setPreferredSize(new Dimension(500,500));

        //4. call method "pack"  (pack all the components in, organize
        //  them, lay them out, put them in the right places, make sure they're
        // the correct sizes, etc.
        pack ();

        //5. make sure we can see our jFrame:
        setVisible(true);

        //6. when you close a jFrame, it doesn't close the jFrame
        //if you want the program to close, you have to tell it to close.
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //add event listener
        // (step 7 in vid_1_order_of_operations):
        //think about the event you want to happen
        //add a click event (event listener)

        //this is an entire event listener with a method, helped from autocomplete:
        //belowVVV///
        // (new ActionListener() {
        //            @Override
        //            public void actionPerformed(ActionEvent e) {
        //
        //            }
        //        });

        //when the button is clicked, a new action listener object will be created from this class definition
        //and the "actionPerformed" method will be called.
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //todo code action goes here; whatever you want to happen when the button is clicked.
                myFirstLabel.setText("Hello GUI programmers!! ");
            }
        });
    }
}
    //by default JFrames aren't visible