/**
 * Enfei Zhang
 * March 8, 2018
 * Ms. Krasteva
 * This program creates a window and contains 2 buttons, one to turn the window black and another to turn the window white.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OnOff implements ActionListener {

    JButton onButton = new JButton("On");   //Creates on button
    JButton offButton = new JButton("Off"); //Creates the off button
    JFrame frame = new JFrame("On and Off");    //Creates the window

    public OnOff(){
        frame.setSize(400, 400);    //Sets the size of the window
        frame.setLayout(new FlowLayout());  //Sets the type of layout
        onButton.addActionListener(this);   //Allows onButton to listen to actions
        offButton.addActionListener(this);  //Allows offButton to listen to actions
        frame.add(onButton);    //Adds the onButton into the window
        frame.add(offButton);   //Adds the offButton into the window
        frame.setVisible(true); //Sets the window to visible
    }

    public void actionPerformed(ActionEvent e){ //This method checks for which button is clicked and performs the action based on it
        if (e.getSource() == onButton)  //If the onButton is clicked
            frame.getContentPane().setBackground(Color.WHITE);  //Changes the background to white
        else    //If the offButton is clicked
            frame.getContentPane().setBackground(Color.BLACK);  //Changed the background to black
    }

    public static void main(String[] args) {
        new OnOff();    //Creates the OnOff object
    }
}
