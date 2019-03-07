package EnfeiZhang_Layout;

import java.awt.*;
import javax.swing.*;

public class ThreeButtons {

    public ThreeButtons(){
        JFrame frame = new JFrame("3 Buttons");
        frame.setSize(240, 90);
        frame.setLayout(new GridLayout(1, 3));
        frame.add(new JButton("A"));
        frame.add(new JButton("B"));
        frame.add(new JButton("C"));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ThreeButtons();
    }
}
