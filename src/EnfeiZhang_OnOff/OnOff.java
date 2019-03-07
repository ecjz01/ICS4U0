package EnfeiZhang_OnOff;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OnOff implements ActionListener {

    JFrame onButton = new JFrame("On");

    public OnOff(){
        JFrame frame = new JFrame("OnOff");
        frame.setSize(800, 400);
        frame.setLayout(new FlowLayout());
        frame.add(new JButton("Off"));
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args) {
        new OnOff();
    }
}
