/**
 * Enfei Zhang
 * March 8, 2018
 * Ms. Krasteva
 * This program creates a square window with 4 buttons.
 */

import javax.swing.*;
import java.awt.*;

public class BottomButtons {

    public BottomButtons(){
        JFrame frame = new JFrame("Bottom Buttons");    //Sets the window
        frame.setSize(300, 300);    //Sets the size of the window
        frame.setLayout(new BorderLayout());    //Sets the type of layout

        JPanel flowPane = new JPanel();     //Creates a new panel
        flowPane.setLayout(new FlowLayout());   //Sets the type of layout
        flowPane.add(new JButton("top"));   //Adds a new button
        frame.add(flowPane, BorderLayout.NORTH);    //Adds everything from flowPane into frame

        JPanel flowPane2 = new JPanel();    //Creates a new panel
        flowPane2.setLayout(new FlowLayout());  //Sets the type of layout
        flowPane2.add(new JButton("Yes"));  //Adds a new button
        flowPane2.add(new JButton("No"));   //Adds a new button
        flowPane2.add(new JButton("??"));   //Adds a new button
        frame.add(flowPane2, BorderLayout.SOUTH);   //Adds everything from flowPane2 into frame
        frame.setVisible(true); //Sets the window to visible
    }

    public static void main(String[] args) {
        new BottomButtons();    //Creates the BottomButtons object
    }
}
