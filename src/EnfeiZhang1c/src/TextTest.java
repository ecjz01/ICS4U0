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
                try{
                    int number = Integer.parseInt(inputField.getText());
                    outputField.setText("The square is " + Integer.toString(number * number));}
                catch (NumberFormatException n){
                    JFrame errorWindow = new JFrame("Error");
                    errorWindow.setSize(200, 200);
                    errorWindow.setLayout(new FlowLayout());
                    JButton error = new JButton("Please enter an integer)");
                    error.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            errorWindow.dispose();
                        }
                    });
                    errorWindow.add(error);
                    errorWindow.setVisible(true); }
            }
        });

    }
}
