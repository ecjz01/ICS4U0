/**
 * The TextTest class creates the inputPrompt and outputResult, which will receive a number an output
 * the number squared.
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @version 19.03.25
 * @author Enfei Zhang
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextTest extends JPanel {

    /**
     * This is the constructor for the TextTest class which adds the inputPrompt and
     * outputResult
     */
    public TextTest(){
        inputPrompt();
        outputResult();
    }

    /**
     * This is the method that prompts for the users input
     *
     * <b>Local Variables </b>
     * <p>
     * <b>enterValue </b> Creates an instance of the JLabel class called "Enter a value".
     */
    public void inputPrompt(){
        JLabel enterValue;
        enterValue = new JLabel("Enter a value");
        enterValue.setFont(new Font("Serif", Font.PLAIN, 16));
        add(enterValue);
    }

    /**
     * This is the method that takes the users input, checks if it is valid and then
     * calculates the square of the numeber if the number is valid
     *
     * <b>Local Variables </b>
     * <p>
     * <b>calculate </b> Creates an instance of the JButton class called "Calculate".
     * <p>
     * <b>inputField </b> Creates an instance of the JTextField class for the input.
     * <p>
     * <b>outputField </b> Creates an instance of the JTextField class for the output.
     */
    public void outputResult(){
        JButton calculate = new JButton("Calculate");
        JTextField inputField = new JTextField(20);
        JTextField outputField = new JTextField(25);
        add(inputField);
        add(outputField);
        add(calculate);
        calculate.addActionListener(new ActionListener() {
            /**
             * This method is to know what action is being performed
             * @param e is what the action is
             */
            public void actionPerformed(ActionEvent e) {
                try{
                    int number = Integer.parseInt(inputField.getText());
                    outputField.setText("The square is " + Integer.toString(number * number));}
                catch (NumberFormatException n){
                    outputField.setText("Please enter a valid integer!");
                    inputField.setText(""); }
            }
        });

    }
}
