/**
 * The JFrameTest2 class creates the application window, menu bar, containing a File menu option with a
 * Quit File menu item and a Help menu option with a Help Help menu item and an About Help menu item.
 * Each option on the menu bar will perform an action; the Quit item will close the window, the Help
 * item will have a dialog box open with a button and the About item will open a dialog box with info about
 * me. It also ensures that the window will close if the user clicks the 'x' button. There is also now an input
 * and output box, in which you input a number and press the calculate button which will output the input number
 * squared.
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @version 19.03.25
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
   * What was added is the Help option on the bar along with a help menu item in it.<p>
   *
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
   * <p>
   * <b>t </b> This creates an instance of the TextTest class.
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
    * This is the method that opens the help dialog box if the user chooses
    * the "Help" item under the "Help" option on the menu bar.
    *
    * <p>
    * <b>Local Variables </b>
    * <p>
    * <b>myDialog </b> This creates an instance of the JDialog class called "Help Me".
    * <p>
    * <b>helpMe </b> This creates an instance of the JLabel class called "Help Me!".
    * <p>
    * <b>closeButton </b> This creates an instance of the JButton class called "Close".
    */
    private void helpDialog(){
      JDialog myDialog = new JDialog(this, "Help Me");
      JLabel helpMe = new JLabel("Help Me!");
      helpMe.setFont(new Font("Serif", Font.PLAIN, 16));
      myDialog.setSize (100, 100);
      myDialog.setResizable(false);
      myDialog.setLayout(new FlowLayout());
      JButton closeButton = new JButton("Close");
      closeButton.addActionListener(new ActionListener(){
        /**
         * This method reads what action heppens.
         * @param e is the action that is happening
         */
        public void actionPerformed(ActionEvent e) {
          myDialog.dispose();
        }
      });
      myDialog.add(helpMe);
      myDialog.add (closeButton);
      myDialog.setLocationRelativeTo(this);
      myDialog.setVisible(true);
    }

    /**
    * This method opens a dialog box telling a fact about me when
    * the "About" item is chosen from the "Help" menu option on the
    * menu bar
    *
    * <p>
    * <b>Local Variables</b>
    * <p>
    * <b>myDialog </b> This creates an instance of the JDialog class called "About me".
    * <p>
    * <b>aboutMe </b> This creates an instance of the JLabel class called "My favourite sport is football (soccer)".
    * <p>
    * <b>closeButton </b> This creates an instance of the JButton class called "Close".
    */
    private void aboutDialog(){
      JDialog myDialog = new JDialog(this, "About me");
      JLabel aboutMe = new JLabel("My favourite sport is football (soccer)");
      aboutMe.setFont(new Font("Serif", Font.PLAIN, 16));
      myDialog.setSize(300, 100);
      myDialog.setResizable(false);
      myDialog.setLayout(new FlowLayout());
      JButton closeButton = new JButton("Close");
      closeButton.addActionListener(new ActionListener() {
        /**
         * This method reads what action heppens.
         * @param e is the action that is happening
         */
        public void actionPerformed(ActionEvent e) {
            myDialog.dispose();
          }
        });
      myDialog.add(aboutMe);
      myDialog.add(closeButton);
      myDialog.setLocationRelativeTo(this);
      myDialog.setVisible(true);
    }
}
