import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutEnfeiZhang extends JPanel implements ActionListener {

    private FlowLayout layout;

    public FlowLayoutEnfeiZhang(){
        layout = new FlowLayout(FlowLayout.RIGHT);
        setLayout(layout);

        JButton directionButton = new JButton("Alignments");
        JButton gapButton = new JButton("Change Gaps");

        directionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        gapButton.addActionListener(this);

        add(directionButton);
        add(gapButton);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals("Alignments")){
            alignment();
        }
        else if (ae.getActionCommand().equals("Change Gaps")){
            changeGaps();
        }
        else if (ae.getActionCommand().equals("Right")){
            layout.setAlignment(FlowLayout.RIGHT);
        }
        else if (ae.getActionCommand().equals("Left")){
            layout.setAlignment(FlowLayout.LEFT);
        }
        else if (ae.getActionCommand().equals("Center")){
            layout.setAlignment(FlowLayout.CENTER);
        }
        else if (ae.getActionCommand().equals("Trailing")){
            layout.setAlignment(FlowLayout.TRAILING);
        }
        else if (ae.getActionCommand().equals("leading")){
            layout.setAlignment(FlowLayout.LEADING);
        }
    }

    private void alignment (){
        JButton rightButton = new JButton("Right");
        JButton leftButton = new JButton("Left");
        JButton trailingButton = new JButton("Trailing");
        JButton leadingButton = new JButton("Leading");
        JButton centerButton = new JButton("Center");

        rightButton.addActionListener(this);
        leftButton.addActionListener(this);
        trailingButton.addActionListener(this);
        leadingButton.addActionListener(this);
        centerButton.addActionListener(this);

        JLabel message = new JLabel("To move in a direction select one of the buttons.");

        add(rightButton);
        add(leftButton);
        add(trailingButton);
        add(leadingButton);
        add(centerButton);
        add(message);
    }


    private void changeGaps(){

    }
}
