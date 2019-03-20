/**
 * The JFrameTest2 class creates the application window, menu bar, containing a File menu option with a
 * Quit File menu item and a Help menu option with a Help Help menu item. It also ensures that the window
 * will close if the user clicks the 'x' button.
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @version 19.03.20
 * @author Enfei Zhang
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameTest3 extends JFrame implements ActionListener{

  /** This is the constructor for the JFrameTest2 class which creates a window containing a bar with 2 menu options.
   * Along with 2 menu options the window will close if you press the 'X'
   * The one that was already there is the File menu option, which contains a quit item.
   * What was added is the Help option on the bar along with a help menu item in it.
   */
  public JFrameTest3() {
    super ("JFrame Test");
    TextTest t = new TextTest();
    add (t);
    JMenuItem quitItem = new JMenuItem ("Quit");
    JMenuItem helpItem = new JMenuItem ("Help");
    JMenuItem aboutItem = new JMenuItem("About");
    JMenu fileMenu = new JMenu ("File");
    JMenu helpMenu = new JMenu ("Help");
    fileMenu.add (quitItem);
    helpMenu.add (helpItem);
    helpMenu.add (aboutItem);
    JMenuBar myMenus = new JMenuBar ();
    myMenus.add (fileMenu);
    myMenus.add (helpMenu);
    setJMenuBar (myMenus);
    quitItem.addActionListener(this);
    helpItem.addActionListener(this);
    aboutItem.addActionListener(this);
    setSize (400, 400);
    setVisible (true);
    setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);  }

    public void actionPerformed (ActionEvent ae){
      if (ae.getActionCommand().equals("Quit")){
        dispose();
      }
      if (ae.getActionCommand().equals("Help")){
        helpDialog();
      }
      if (ae.getActionCommand().equals("About")){
        aboutDialog();
      }
    }

    private void helpDialog(){
      JDialog myDialog = new JDialog(this, "Help Me");
      myDialog.setSize (100, 100);
      myDialog.setResizable(false);
      myDialog.setLayout(new FlowLayout());
      JButton helpButton = new JButton("Help Me!");
      helpButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
          myDialog.dispose();
        }
      });
      myDialog.add (helpButton);
      myDialog.setLocationRelativeTo(this);
      myDialog.setVisible(true);
    }

    private void aboutDialog(){
      JDialog myDialog = new JDialog(this, "About me");
      myDialog.setSize(300, 70);
      myDialog.setResizable(false);
      myDialog.setLayout(new FlowLayout());
      JButton aboutMe = new JButton("My favourite sport is football (soccer)");
      aboutMe.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            myDialog.dispose();
          }
        });
      myDialog.add(aboutMe);
      myDialog.setLocationRelativeTo(this);
      myDialog.setVisible(true);
    }
}
