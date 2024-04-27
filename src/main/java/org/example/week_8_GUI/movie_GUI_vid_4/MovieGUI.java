package org.example.week_8_GUI.movie_GUI_vid_4;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//add "extends JFrame" just below

public class MovieGUI extends JFrame{

    private JTextField movieTitleTextField;
    private JSlider ratingSlider;
    private JCheckBox wouldSeeAgainCheckBox;
    private JPanel mainPanel;
    private JLabel sliderValueLabel;
    private JLabel movieOpinionLabel;
    private JButton quitButton;

    //create constructor:
    MovieGUI() {
        //set the content pane with the name of your JPanel. Here: "main panel":
        setContentPane(mainPanel);

        //make sure setPreferred size is before the pack:
        setPreferredSize(new Dimension(400, 300));

        //figure out how big each component is and pack them into the panel
        pack();
        //make sure it can be seen:
        setVisible(true);
        //exits when the window closes:
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //set up method that will deal with all the event handlers:
        //this method belongs to the MovieGUI.java class
        configureEventHandlers();

    }
    //set the method that will deal with all the event handlers:
    private void configureEventHandlers(){
        //this will be called every time a change event happens for the rating slider:
        ratingSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                //use this to change the label to the right of the slider to match the number of stars:
                String valueLabelText = ratingSlider.getValue() + " stars "; //could use a format string
                //sliderValueLabel (looks like "0 stars"):
                sliderValueLabel.setText(valueLabelText);

                //call method: (tag in this method and then bop down to it to change the
                // message in "Movie Opinion" with textfield: movieOpinionLabel)
                updateOpinion();
            }
        });
        //add event handler to change the opinion if the checkbox is checked or not checked:
        wouldSeeAgainCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateOpinion();
                //this updates the opinion and changes the message
            }
        });
        //notes in vid_4_notes #13:
        //get document is an object that represents the text that's inside the JTextField (here: movieTitleTextField)
        //add the documentLister to see when it's changing:
        //then add "new DocumentListener" (etc. using autocomplete) **this gives 3 methods!
        movieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            //text is added when text is typed
            public void insertUpdate(DocumentEvent e) {
                //add:
                updateOpinion();
            }

            @Override
            //text is removed when text is deleted or removed:
            public void removeUpdate(DocumentEvent e) {
                //add:
                updateOpinion();
            }

            @Override
            //called when the font size (for example) is changed:
            //ignore:
            public void changedUpdate(DocumentEvent e) {

            }
        });
        //use button clicks are: addActionListener
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //first option (outlined in vid_4_notes number 18:
//                //add a JOptionPane to confirm the user wants to quit:
//                if (JOptionPane.showConfirmDialog(MovieGUI.this, "Are you sure you want to quit?",
//                        //if the OK_CANCEL_OPTION is equal to OK_OPTION then this program will quit.
//                        "Quit", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION ) {
//
//                    //call JFrame method called dispose() that will get rid of the current JFrame:
//                    dispose();
//                    //because we have EXIT ON CLOSE in MOVIEGUI, if this dispose is called, the whole thing will close
//                }
        //notes in vid_4_notes number 19:
            int quit = JOptionPane.showConfirmDialog(MovieGUI.this, "Are you sure you want to quit?",
                        "Quit", JOptionPane.OK_CANCEL_OPTION);
                    if(quit == JOptionPane.OK_OPTION){
                dispose();
                }
            }
        });
    }

    //write a method to update the opinion in the JLabel called "movieOpinionLabel":
    private void updateOpinion() {
        //add .strip to make sure the user doesn't have extra spaces around their movie name:
        String movieName = movieTitleTextField.getText().strip();

        //shown in vid_4_notes#20:

        // if there isn't anything in the box where the user types a movie title:
//        if (movieName.isEmpty()) {
//            //show the original message (so if things got deleted, return to baseline)
//            movieOpinionLabel.setText("Movie opinion");
//            //this return would stop the rest of the processing from happening:
//            return;
//        }

        //shown in vid_4_notes #21:
        if(movieName.isEmpty()) {
            movieOpinionLabel.setText("Movie Opinion");
        } else {

            int rating = ratingSlider.getValue();
            boolean seeAgain = wouldSeeAgainCheckBox.isSelected();

            //string using the above inputs ^^^
            //%s = movieName
            //%d = rating (number of stars)
            //%s = seeAgain (would or would not see again)
            String template = "You rated %s %d stars. You %s see again.";

            //add this to change the 'would' to 'would not' depending on check status
//        String seeAgainString = "would";
////        if (seeAgain == false) { //could also be written:
//            if (!seeAgain) {
//                seeAgainString = "would not";
//            }
            //added in vid_4_notes number 11.
            //alternative ***_ternary operator_***: for setting values based on a condition
            //write condition "seeAgain" in parentheses: seeAgain is a boolean
            //add a question mark
            //add the value you want the seeAgain to be set to if the boolean (seeAgain) is true: "would"
            //add value you want seeAgain to be set to if the boolean (seeAgain) is false: "would not"
            String seeAgainString = (seeAgain) ? "would" : "would not";

            //run Main, works well!


            //create opinion:
            String opinion = String.format(template, movieName, rating, seeAgainString);

            //set the movieOpinionLabel using the above string:
            movieOpinionLabel.setText(opinion);
        }
    }
}
