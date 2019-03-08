/**
 * Enfei Zhang
 * March 8, 2018
 * Ms. Krasteva
 * This program creates a window with 3 buttons
 */

import java.awt.*;
import javax.swing.*;

public class ThreeButtons {

    public ThreeButtons(){
        JFrame frame = new JFrame("3 Buttons"); //Sets the window
        frame.setSize(240, 90); //Sets the size of the window
        frame.setLayout(new GridLayout(1, 3));  //Sets the layout of the window
        frame.add(new JButton("A"));    //Adds a new button
        frame.add(new JButton("B"));    //Adds a new button
        frame.add(new JButton("C"));    //Adds a new button
        frame.setVisible(true); //Sets the window to visible
    }

    public static void main(String[] args) {
        new ThreeButtons(); //Creates a THreeButtons object
    }
}
