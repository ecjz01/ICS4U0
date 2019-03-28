import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutApp extends JFrame {

    public LayoutApp(){
        super  ("Layouts");
        add(new FlowLayoutEnfeiZhang());

        JMenuItem flowLayout = new JMenuItem("Flow Layout");
        JMenuItem groupLayout = new JMenuItem("Group Layout");

        flowLayout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                add(new FlowLayoutEnfeiZhang());
                validate();
            }
        });

        groupLayout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
            //    add(new GroupLayoutEnfeiZhang());
                validate();
            }
        });

        JMenu layouts = new JMenu("Set Layout");
        layouts.add(flowLayout);
        layouts.add(groupLayout);

        JMenuBar menu = new JMenuBar();
        menu.add(layouts);

        setJMenuBar(menu);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LayoutApp();
    }
}
