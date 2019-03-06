package EnfeiZhang_Envelope;

import javax.swing.*;
import java.awt.*;

public class Envelope {

    public Envelope()
    {
        JFrame frame = new JFrame("Envelope");
        frame.setSize(800, 400);
        frame.add(new Drawing());
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Envelope();
    }

    class Drawing extends JComponent{
        Font Arial = new Font("Arial", Font.PLAIN, 20);
        public void paint (Graphics g){
            g.setFont(Arial);
            g.drawString("Enfei Zhang", 60, 50);
            g.drawString("69 Touchstone Dr.", 60, 75);
        }
    }
}

