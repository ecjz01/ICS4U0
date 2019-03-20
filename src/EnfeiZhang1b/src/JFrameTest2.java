/**
 * The JFrameTest2 class creates the application window, menu bar, containing a File menu option with a
 * Quit File menu item and a Help menu option with a Help Help menu item and an About Help menu item.
 * Each option on the menu bar will perform an action; the Quit item will close the window, the Help
 * item will have a dialog box open with a button and the About item will open a dialog box with info about
 * me. It also ensures that the window will close if the user clicks the 'x' button.
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.JFrameTest2
 *
 * @version 19.03.20
 * @author Enfei Zhang
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Font;

public class JFrameTest2 extends JFrame implements ActionListener{

  /**
   * This is the constructor for the JFrameTest2 class which creates a window containing a bar with 2 menu options.
   * Along with 2 menu options the window will close if you press the 'X'
   * The one that was already there is the File menu option, which contains a quit item.
   * What was added is the Help option on the bar along with a help menu item in it.
   *
   * <p>
   * <b>Local variables: </b>
   * <p>
   * <b>quitItem </b> This creates an instance of the JMenuItem class called "Quit".
   * <p>
   * <b>helpItem </b> This creates an instance of the JMenuItem class called "Help".
   * <p>
   * <b>aboutItem </b> This creates an instance of the JMenuItem class called "About".
   * <p>
   * <b>fileMenu </b> This creates an instance of the JMenu class called "File".
   * <p>
   * <b>helpMenu </b> This creates an instance of the JMenu class called "Help".
   * <p>
   * <b>myMenus </b> This creates an instance of the JMenuBar class.
   */
  public JFrameTest2() {
    super ("JFrame Test");
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

  /**
   * This is the method that reads what action happens to know
   * which method to run
   *
   * @param ae is the action that is being performed
   */
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

  /**
   * This method opens a dialog box telling a fact about me when
   * the "About" item is chosen from the "Help" menu option on the
   * menu bar
   */
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

  /**
   * This is the method that opens the help dialog box if the user chooses
   * the "Help" item under the "Help" option on the menu bar.
   */
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
}
