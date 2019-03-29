/**
 * The LayoutApp is the class that will creat a JFrame window to run the GroupLayoutEnfeiZhang and FlowLayoutEnfeiZhang classes.
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @version 19.03.29
 * @author Enfei Zhang
 */

import javax.swing.*;
import java.awt.event.*;

public class LayoutApp extends JFrame {

    /**
     * This is the constructor for the LayoutApp class
     *
     * <b>Local Variables</b>
     * <p>
     * <b>flowLayout</b>
     * <p>
     * <b>groupLayout</b>
     * <p>
     * <b>layouts</b>
     * <p>
     * <b>menu</b>
     */
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
                add(new GroupLayoutEnfeiZhang());
                validate();
            }
        });

        JMenu layouts = new JMenu("Set Layout");
        layouts.add(flowLayout);
        layouts.add(groupLayout);

        JMenuBar menu = new JMenuBar();
        menu.add(layouts);

        setJMenuBar(menu);

        setSize(1000, 400);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /** This method calls the LayoutApp constructor to
     * create the application.
     *
     * @param args [ ]  String array that allows command line
     * parameters to be used when executing the program.
     */
    public static void main(String[] args) {
        new LayoutApp();
    }
}
