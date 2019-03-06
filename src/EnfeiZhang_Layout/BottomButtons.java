package EnfeiZhang_Layout;

import javax.swing.*;
import java.awt.*;

public class BottomButtons {

    public BottomButtons(){
        JFrame frame = new JFrame("Bottom Buttons");
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());
        JPanel borderPane = new JPanel();
        frame.add(new JButton("top"));
        frame.add(new JButton("Yes"));
        frame.add(new JButton("No"));
        frame.add(new JButton("??"));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BottomButtons();
    }
}
