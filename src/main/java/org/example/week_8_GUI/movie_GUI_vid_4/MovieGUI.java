package org.example.week_8_GUI.movie_GUI_vid_4;

import javax.swing.*;
//add "extends JFrame" just below

public class MovieGUI extends JFrame{

    private JTextField movieTitleTextField;
    private JSlider ratingSlider;
    private JCheckBox wouldSeeAgainCheckBox;
    private JPanel mainPanel;
    private JLabel sliderValueLabel;
    private JLabel movieOpinionLabel;

    //create constructor:
    MovieGUI() {
        //set the content pane with the name of your JPanel. Here: "main panel":
        setContentPane(mainPanel);
        //figure out how big each component is and pack them into the panel
        pack();
        //make sure it can be seen:
        setVisible(true);
        //exits when the window closes:
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //set up method that will deal with all the event handlers:
        //this method belongs to the MovieGUI class
        configureEventHandlers();

    }
    //set the method that will deal with all the event handlers:
    private void configureEventHandlers(){
        //todo finish this method
    }

    //write a method to update the opinion in the JLabel called "movieOpinionLabel":
    private void updateOpinion() {
        //todo finish this
    }
}
