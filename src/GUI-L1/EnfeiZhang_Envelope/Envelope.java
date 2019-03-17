/**
 * Enfei ZHang
 * March 8, 2018
 * Ms. Krasteva
 * This program creates a window in the shape of an envelope with my name and address on it.
 */

import javax.swing.*;
import java.awt.*;

public class Envelope {

    public Envelope()
    {
        JFrame frame = new JFrame("Envelope");  //Sets the window
        frame.setSize(800, 400);    //Sets the size of the window
        frame.add(new Drawing());   //Adds the text onto the window
        frame.setVisible(true); //Makes the window visible
    }

    public static void main(String[] args) {
        new Envelope(); //Creates the Envelope object
    }

    class Drawing extends JComponent{   //This class is the drawing that goes onto the window

        public void paint (Graphics g){ //This method draws the text onto the window
            Font Arial = new Font("Arial", Font.PLAIN, 20);
            g.setFont(Arial);
            g.drawString("Enfei Zhang", 60, 50);
            g.drawString("39 Touchstone Dr.", 60, 75);
        }
    }
}

