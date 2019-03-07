package EnfeiZhang_Layout;

import javax.swing.*;
import java.awt.*;

public class BottomButtons {

    public BottomButtons(){
        JFrame frame = new JFrame("Bottom Buttons");
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());
        JPanel flowPane = new JPanel();
        flowPane.setLayout(new FlowLayout());
        flowPane.add(new JButton("top"), BorderLayout.NORTH);
        frame.add(flowPane);
        JPanel borderPane = new JPanel();
        borderPane.setLayout(new FlowLayout());
        borderPane.add(new JButton("Yes"), BorderLayout.SOUTH);
        borderPane.add(new JButton("No"), BorderLayout.SOUTH);
        borderPane.add(new JButton("??"), BorderLayout.SOUTH);
        frame.add(borderPane);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BottomButtons();
    }
}
