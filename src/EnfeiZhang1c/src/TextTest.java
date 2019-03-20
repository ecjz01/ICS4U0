import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextTest extends JPanel {

    public TextTest(){
        inputPrompt();
        outputResult();
    }

    public void inputPrompt(){
        JLabel enterValue;
        enterValue = new JLabel("Enter a value");
        enterValue.setFont(new Font("Serif", Font.PLAIN, 16));
        add(enterValue);
    }

    public void outputResult(){
        JButton calculate = new JButton("Calculate");
        JTextField inputField = new JTextField(20);
        JTextField outputField = new JTextField(25);
        add(inputField);
        add(outputField);
        add(calculate);
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(inputField.getText());
                outputField.setText("The square is " + Integer.toString(number * number));
            }
        });
    }
}
